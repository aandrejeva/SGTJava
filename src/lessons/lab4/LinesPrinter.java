package lessons.lab4;

import java.util.Scanner;

public class LinesPrinter {

	public static void main(String[] args) {
		// declare local variables
		String word;
		
		Scanner input = new Scanner(System.in);
		//input
		System.out.println("Enter a one word: ");
		word = input.next();//one word will counted
		
		//counter-controlled loop
		// LinesPrinter
		// 0 1 2 3 4 5 6......
		int length = word.length();
		for(int i = 0; i < length; i++) {
			//retrieve the letter from at index i
			char letter = word.charAt(i);
			//print on each line a letter
//			System.out.println(letter);
			
			//print stars*****
			System.out.print("*");
		}
		
		System.out.println();
		//counter-controlled loop to reverse the the word
		for(int i = length-1; i>=0; i--) {
			//retrieve the letter from at index i
			char w = word.charAt(i);
			System.out.print(w);
		}
		
		
	}//end main

}//end class
