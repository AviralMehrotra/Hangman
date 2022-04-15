package game;

import java.util.Random;

public class Words {
	
    private String[] randomwords = {"animals", "human", "food","college","gaming", "friends", "network","engineer", "doctor", "family","india","watch", "money", "information", "independence"};
    
    private String selectedWord;
    
    private Random random= new Random();
    
    private char[] letters;
    
    public Words() {
    	selectedWord= randomwords[random.nextInt(randomwords.length)];
    	letters= new char[selectedWord.length()];
    }
    
    public String toString() {
    	
    	StringBuilder text= new StringBuilder();

    	
    	for(char letter: letters)
    	{
    		text.append(letter== '\u0000' ? '_' : letter);
    		
    		text.append(' ');
    	}
    	return text.toString();
    }
    
    public boolean isGuessedRight()
    {
    	for(char letter: letters){
    		if(letter== '\u0000') {
    			return false;
    		}
    	}
    	return true;
    }
	public boolean guess(char letter) {
		
		boolean guessedRight= false;
		
		
		for(int i=0;i<selectedWord.length();i++)
		{
			if(letter==selectedWord.charAt(i)) {
				letters[i]= letter;
				guessedRight= true;
			}
		}
		return guessedRight;
		
	}
    
}    

	