package lessons.lab4;

import java.util.Scanner;

public class StarWordApp {

	public static void main(String[] args) {
		// declare variables
		String word;
		int computeMethodNumber;
		
		//declare a variable named scanner and create and object of type Scanner;
		Scanner scanner = new Scanner(System.in);
		
		
		boolean running = true;
		//input use do while loop
		do {
		//declare a variable starWord and create an object of type StarWord	
		StarWord starWord = new StarWord();
		//out print "Please enter a word", then store the variable and make it to lower case, use setWord
		//then put our scanner inside the set word inside the instantiable class
		System.out.println("Please enter a word:");
		word = scanner.next().toLowerCase();
		starWord.setWord(word);
		
		//user choose which method from instantiable class to use		
		System.out.println("Please choose which method to use: 1 - computeVowels, 2 - computeStars, 3 - computePigLatin, 4 - reverseWord" );
		computeMethodNumber = scanner.nextInt();
		//we can use switch case: if user choose 1 the program compute vowels, if 2 - computeStars,
		// if 3 - computePigLatin, if 4 - reverseWord (we also can use if/else)
		switch (computeMethodNumber) {
			case 1:
				starWord.computeVowels(); //process
				System.out.println("The word: " + word + " changed by computeVowels method to " + starWord.getStringBuffer());//output
				break;	
			case 2:
				starWord.computeStars();
				System.out.println("The word: " + word + " changed by computeStars method to " + starWord.getStringBuffer());
				break;
			case 3:
				starWord.computePigLatin();
				System.out.println("The word: " + word + " changed by computePigLatin method to " + starWord.getStringBuffer());
				break;
			case 4:
				starWord.reverseWord();
				System.out.println("The word: " + word + " changed by reverseWord method to " + starWord.getStringBuffer());
				break;
			default:
				System.out.println("Wrong input");
		}//end switch
		
		//ask user continue or finish program
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
