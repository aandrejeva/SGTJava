package lessons.lesson6;
/*
 GuessApp
 Lets use Lab3 (from 22.03.2020) as the instantiable class, to calculate the users guess number.
 Number of guess: 3 (how many times user can guess is 3)
 */

import java.util.Scanner;

public class GuessApp1 {

	public static void main(String[] args) {
		
		//declare a local variables
		int guess;
		
	Scanner input = new Scanner(System.in);	
	
	GuessNumber checker  = new GuessNumber();
	for (int i = 0; i < 3; i++) { // 3 is the default value
		// input
		System.out.println("Enter to guess the number: ");
		guess = input.nextInt();
		
		checker.setGuess(guess);
		
		//processing
		checker.compute();
		
		//output
		String m = checker.getMessage();
		System.out.println(m);
		
		if(m.equals("congrats")) {
			break;
		}
	}//end for
	
	int s = checker.getSecret();
	System.out.println("secret: " + s);
	
}// end main

}//end class
  