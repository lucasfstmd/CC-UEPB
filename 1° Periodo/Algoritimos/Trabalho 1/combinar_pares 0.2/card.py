class Card:
	def __init__(self, image, rect, name):
		self.image = image
		self.rect = rect
		self.name = name
		
		self.shown = False
		self.done = False
		
	def toggle_visibility(self):
		if self.shown:
			self.shown = False
		else:
			self.shown = True