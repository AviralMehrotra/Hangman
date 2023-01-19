import random

from words import wordlist
from hangman_heading import logo
chosenWord= random.choice(wordlist)
wordLen= len(chosenWord)

GameOver= False
lives= 7
print(logo)
displayedWord= []
for _ in range(wordLen):
    displayedWord+= "_"

while not GameOver:
    guess= input("\nEnter your guess: ").lower()

    if guess in displayedWord:
        print(f"\nWord is already guessed {guess}")

    for position in range(wordLen):
        letter= chosenWord[position]
        if letter== guess:
            displayedWord[position]= letter

    if guess not in chosenWord:
        print(f"\nYou chose {guess} but it wasn't found in the word\n")
        lives -= 1
        if lives== 0:
            GameOver= True
            print(f"\nGame Over ! Loser \n The word was {chosenWord}\n")
            

    print(f"{' '.join(displayedWord)}")

    if "_" not in displayedWord:
        GameOver= True
        print("\nGame Over ! Winner !!")
        
        
