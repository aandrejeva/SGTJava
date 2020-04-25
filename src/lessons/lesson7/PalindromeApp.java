package lessons.lesson7;

import java.util.Scanner;

/**
A palindrome is a string that reads the same forwards and backwards. For
example, noon and madam are spelled the same forward and backward.
Develop an application which reads in a string and determines whether it is
a palindrome. If the input string is a palindrome, your application should
display the message:
The string is a palindrome.
Otherwise, it should print out the message:
The string is not a palindrome.
PalindromeApp is an application which does the following tasks
-- prompts the user to input a text
-- uses the instantiable class Palindrome to compute whether the user's input is a palindrome or not
-- retrieves the result of the palindrome check and displays it
*/
public class PalindromeApp {

	public static void main(String[] args) {
		//declare local variables
		String t;//to store user input
		String message;//to store the palindrome message
		
		//create object of type Scanner 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a text: ");
		t = sc.nextLine();
		
		//create an object of type Palindrome
		Palindrome palindrome = new Palindrome();
		
		//call setter method to store the users input inside our object instance variable text
		palindrome.setText(t);
		
		//process
		//call decideIsPalindrome to compute the given text is a palindrome or not
		palindrome.decideIsPalindrome();
		
		//call getter method
		message = palindrome.getpalindromeMessage();//to retrieve whetever the given text is a palindrome
		System.out.println(message);
		
	}//end main

}//end class
