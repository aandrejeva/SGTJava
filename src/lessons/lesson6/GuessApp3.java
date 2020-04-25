package lessons.lesson6;

import java.util.Scanner;
/**
Problem 3
GuessApp3 
	uses the instantiable class GuessNumber
	allows the user to guess the number, and then ask the user whether would they like to guess again.
	If they answer yes, the application should run again, if they answer no, the application should end.
*/
public class GuessApp3 {

	public static void main(String[] args) {
		//declare a local variables
		int guess;
		
		//declare a variable named scanner and create and object of type Scanner
		Scanner scanner = new Scanner(System.in);	
		
		boolean running = true;
		//input use do while loop
		do {
		//declare a variable and create an object of type GuessNumber
		GuessNumber guessNumber = new GuessNumber();
		
		for (int i = 0; i < 3; i++) { // 3 is the default value (3 times user can guess the number)
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
		}//end for
		
		int s = guessNumber.getSecret();
		System.out.println("secret: " + s);
		
		//ask user continue or finish the program
		System.out.println("Do you wish to continue? (choose 'y' or 'n')");
		String answer = scanner.next().toLowerCase();
			if(answer.equals("n")) {
				running = false;
				System.out.println("The program is finished.");
			}
		}
		while (running);// the program is running till the condition is true
		
	}//end main

}//end class
