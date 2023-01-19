import random

from words import wordlist

chosenWord= random.choice(wordlist)
wordLen= len(chosenWord)

GameOver= False
lives= 7

displayedWord= []
for _ in range(wordLen):
    displayedWord+= "_"

while not GameOver:
    guess= input("Enter your guess: ").lower()

    if guess in displayedWord:
        print(f"Word is already guessed {guess}")

    

