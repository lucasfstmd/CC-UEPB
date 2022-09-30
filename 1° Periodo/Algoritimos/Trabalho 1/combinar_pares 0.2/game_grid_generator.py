import pygame, random, os
from card import Card

images = os.listdir('emojis')

def _get_random_emoji():
    emoji = images.pop(random.randint(0, len(images)-1))
    return os.path.join('emojis', emoji)

def _resize_surface(surface, mult):
    new_size = (int(surface.get_width()*mult), int(surface.get_height()*mult))
    return pygame.transform.scale(surface, new_size)

def _get_empty_matrix():
    matrix = []
    for i in range(4):
        matrix.append([])
        for j in range(4):
            matrix[i].append(0)
    return matrix

def get_random_game_grid(surface_size):
    matrix = _get_empty_matrix()

    # Create a list with 8 pairs of emojis. For a total of 16 emojis for the 4x4 grid.
    emojis = []
    for i in range(8):

        random_emoji = _get_random_emoji()
        emojis.append(random_emoji)
        emojis.append(random_emoji)
    random.shuffle(emojis)
    

    # Fill matrix with cards that have emojis and rects
    # Each loop it pops an emoji from the shuffled emoji list
    eigths = [surface_size*1/8, surface_size*3/8, surface_size*5/8, surface_size*7/8]
    
    for y, i in zip(range(4), eigths):
        for x, j in zip(range(4), eigths):
            emoji_name = emojis.pop()
            emoji_surface = pygame.image.load(emoji_name)
            emoji_surface.convert_alpha()
            emoji_surface = _resize_surface(emoji_surface, 0.27)

            rect = pygame.Rect(0, 0, 130, 130)
            rect.center = (i, j)
            
            matrix[y][x] = Card(emoji_surface, rect, emoji_name)

    return(matrix)