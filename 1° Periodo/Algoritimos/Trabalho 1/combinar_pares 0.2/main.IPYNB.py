import pygame, sys
import game_grid_generator

pygame.init()
clock = pygame.time.Clock()

# SET UP THE DISPLAY
SCREEN_WITH, SCREEN_HEIGHT = 600, 640
screen = pygame.display.set_mode((SCREEN_WITH, SCREEN_HEIGHT))

# COLORS
BG_COLOR = (249, 247, 247)
COLOR1 = (219, 226, 239)
COLOR2 = (63, 114, 175)
COLOR3 = (17, 45, 78)

# OTHER GLOBAL VARIABLES
SCORE_BAR_RECT = pygame.Rect(0, 600, 600, 40)
GAME_RECT = pygame.Rect(0, 0, 600, 600)
FONT = font = pygame.font.SysFont('comicsansms', 30)

# GAME STATES
NO_CARDS_CLICKED = 0
FIRST_CARD_CLICKED = 1
SECOND_CARD_CLICKED = 2

def quit():
    pygame.quit()
    sys.exit()

def all_cards_done(matrix):
    for row in matrix:
        for card in row:
            if card.done == False:
                return False

    return True

def draw_cards(matrix):
    for i in range(4):
        for j in range(4):
            card = matrix[i][j]
            if not card.shown:
                pygame.draw.rect(screen, COLOR2, card.rect)
            elif card.shown:
                pygame.draw.rect(screen, COLOR3, card.rect)
                emoji_rect = card.image.get_rect()
                emoji_rect.center = card.rect.center
                screen.blit(card.image, emoji_rect)

def draw_time():
    seconds = pygame.time.get_ticks()/1000
    font_surface = FONT.render(f'Tempo: {seconds:.0f}', True, (0, 0, 0))
    font_rect = font_surface.get_rect()
    font_rect.midleft = SCORE_BAR_RECT.midleft
    screen.blit(font_surface, font_rect)

def draw_erros():
    font_surface = FONT.render(f'Erros: {erros}', True, (0, 0, 0))
    font_rect = font_surface.get_rect()
    font_rect.center = SCORE_BAR_RECT.center
    screen.blit(font_surface, font_rect)

matrix = game_grid_generator.get_random_game_grid(600)

game_state = NO_CARDS_CLICKED
first_card = ''
second_card = ''
second_card_clicked_time = 0

erros = 0

playing = True
while playing:
    # RENDER THE SCREEN
    screen.fill((BG_COLOR))
    pygame.draw.rect(screen, COLOR2, SCORE_BAR_RECT)
    pygame.draw.rect(screen, COLOR1, GAME_RECT)
    draw_cards(matrix)
    draw_time()
    draw_erros()

    # HANDLE EVENTS
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            quit()

        if event.type == pygame.MOUSEBUTTONDOWN:
            pos = event.pos
            for row in matrix:
                for card in row:
                    if card.rect.collidepoint(pos): # check if the mouse pos is inside de card's rect
                        if card.done:
                            break
                        
                        elif game_state == NO_CARDS_CLICKED:
                            first_card = card
                            card.toggle_visibility()
                            game_state = FIRST_CARD_CLICKED
                        
                        elif game_state == FIRST_CARD_CLICKED and (card != first_card):
                            second_card = card
                            card.toggle_visibility()

                            if first_card.name == second_card.name:
                                game_state = NO_CARDS_CLICKED
                                first_card.done = True
                                second_card.done = True
                                if all_cards_done(matrix):
                                    print('GAME OVER')
                                    print(pygame.time.get_ticks()/1000, erros)
                            else:
                                game_state = SECOND_CARD_CLICKED
                                second_card_clicked_time = pygame.time.get_ticks()


    # HANDLE WAIT TIME TO HIDE OR KEEP CARDS VISIBLE
    if game_state == SECOND_CARD_CLICKED:
        if (pygame.time.get_ticks() - second_card_clicked_time) > 400:
            game_state = NO_CARDS_CLICKED
            # hide them again
            first_card.toggle_visibility()
            second_card.toggle_visibility()
            erros += 1
                        
    # UPDATE THE WINDOW AND TICK FPS
    pygame.display.update()
    clock.tick(60)
