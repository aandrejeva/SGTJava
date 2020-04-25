package lessons.lab;

import java.util.Scanner;

/*
Use instantiable classes in your application. Save the instantiable class as Theatre2.java
Theatre2App.java 
-- prompts the user to input a day and the age of the customer
-- uses the instantiable class Theatre2 to determine the actual cost of a theatre ticket based on the given day and age
 */
public class Theatre2App {

	public static void main(String[] args) {
		
		String day; // declare a variable to store the day entered by the user
		int customerAge; // declare a variable to store the age of customer entered by the user
		
		// declare a variable named t and create an object of type Theatre2
		Theatre2 t = new Theatre2(0, 15, 20, 5, 20, 30);
		
		// create an object of type Scanner to allow input from the keyboard
		Scanner input = new Scanner(System.in);
		// input
        // prompt the user to input the day of week
		System.out.println("Please enter the day of week: ");
		// reads a single word from the keyboard
		day = input.next();
		
		// prompt the user to input the customer age
		System.out.println("Please enter your age: ");
		// reads an integer number from the keyboard
		customerAge = input.nextInt();
		
		// processing: display the price of a ticket according the given day and age
		t.displayTicketPrice(day, customerAge);
	
	}//end main

}//end class
