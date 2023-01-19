package game;

import java.util.Scanner;

public class GuessTheWord {

	private boolean play = true;
	private Words randomwords = new Words();
	private Scanner scanner = new Scanner(System.in);
	private int rounds = 10;
	private char lastRound;

	public void start() {

		do {
			showWord();
			getInput();
			checkInput();
		} while (play);
	}

	void showWord() {
		System.out.println("You have "+rounds +" tries left...");
		System.out.println(randomwords);
	}

	void getInput() {

		System.out.print("Enter a letter to guess the word-");
		String userGuess = scanner.nextLine();
		lastRound = userGuess.charAt(0);
	}

	void checkInput() {

		boolean isGuessedRight = randomwords.guess(lastRound);

		if (isGuessedRight) {
			if (randomwords.isGuessedRight()) {
				System.out.println("\n\nCongrats...");
				System.out.println("You Won !!");
				System.out.println("The Word is: " + randomwords);
				play = false;
			}
		}
		else {
			rounds--;
			
			if(rounds==0) {
				System.out.println("\n\nGame Over !!");
				play= false; 
			} 
		}
	}

	public void end() {
		scanner.close();

	}
}
