package lessons.lesson6;

import java.util.Scanner;

/**
Problem 2
GuessApp2 
	uses the instantiable class GuessNumber
	allows the user to guess the number. User can enter the guess number (the number of how many times user can guess)
*/
public class GuessApp2 {

	public static void main(String[] args) {
		//declare a local variable
		int numberOfGuess;
		int guess;
			
		//declare a variable named scanner and create and object of type Scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of guess: ");
		numberOfGuess = scanner.nextInt();
		
		//declare a variable and create an object of type GuessNumber
		GuessNumber guessNumber = new GuessNumber();
		
		for (int i = 0; i < numberOfGuess; i++) {
			// input
			System.out.println("Enter to guess the number: ");
			guess = scanner.nextInt();
			guessNumber.setGuess(guess);
			
			//processing
			guessNumber.compute();
			
			//output
			String m = guessNumber.getMessage();
			System.out.println(m);
			
			if(m.equals("congrats")) {
				break;
			}	
		}//end for loop
		
		int s = guessNumber.getSecret();
		System.out.println("secret: " + s);

	}//end main
	
}//end class
