package lessons.lab;
import java.util.*;
/**
Calculates the change owned to a customer.
SaturdayLab1: Data types. Variables. Constants.
Problem 7
ChangeCalculator is an application that helps a seller to give the right
change to a customer. The application prompts the user to enter the total
price of the items bought and the received received from the customer. The
application calculates and displays the change the customer is owed. In
addition, the application calculates and displays the maximum number of
how many EUR 50, EUR 20, EUR 10 and EUR 5 notes, and how many
EUR 2 and EUR 1 coins the seller has to give to the customer as change.
For simplicity, let's consider that the seller does not want to deal with small
coins (i.e. 50c, 20c, etc.), therefore although the total price of the items
bought may be a decimal number the seller will enter the price rounded
down to the nearest euro (e.g. 24.7 will be rounded down to 24). Write, compile and test whether the application provides the right change.
Save the class as ChangeCalculator.java
*/
public class ChangeCalculator {

	public static void main(String[] args) {
		// declare variables
		int price, received, change;
		int pay50, pay20, pay10, pay5, pay2, pay1;
		
		// input
		// declare a variable of type Scanner and create an object of type Scanner to accept the user's input from the keyboard
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter total price of your product:");
		price = input.nextInt(); // read the total price provided by the user via keyboard
		// above we saved in the variable price the total price entered by the user
		
		System.out.println("Enter amount you gave to:");
		// save the money given by the user
		received = input.nextInt();
		
		// processing + output
		// calculate the change owed to the customer
		change = received - price;
		System.out.println("Customer should receive back " + change + " EUR");
		
		// calculate the number of 50 EUR notes to be given
		pay50 = change / 50;
		System.out.println("50 EUR note(s): " + pay50);
		
		// update the current change
		// we must update the remaining change to be given to the customer because we have already 
		//established the number of 50 EUR note(s) to be given
		// if we do not update the change we would give more money back to the customer than required
		// we can save/store the remaining received to be paid in the same variable change because we do
		//not use further the value currently stored in the variable change (therefore we overwrite the existing value)
		//as that value contains also the amount received of 50 EUR note(s) already accounted for in the variable pay50
		change = change - 50 * pay50;
		
		pay20 = change / 20;
		System.out.println("20 EUR note(s): " + pay20);
		change = change - 20 * pay20;
		
		pay10 = change / 10;
		System.out.println("10 EUR note(s): " + pay10);
		change = change - 10 * pay10;
		
		pay5 = change / 5;
		System.out.println("5 EUR note(s): " + pay5);
		change = change - 5 * pay5;
		
		pay2 = change / 2;
		System.out.println("2 EUR coin(s): " + pay2);
		change = change - 2 * pay2;
		
		pay1 = change / 1;
		System.out.println("1 EUR coin(s): " + pay1);
		change = change - 1 * pay1;
		
		System.out.println("=================================");
		System.out.println("The customer should be given:");
		System.out.println(pay50 + " fifty euro note(s)");
		System.out.println(pay20 + " twenty euro note(s)");
		System.out.println(pay10 + " ten euro note(s)");
		System.out.println(pay5 + " five euro note(s)");
		System.out.println(pay2 + " two euro coin(s)");
		System.out.println(pay1 + " one euro coin(s)");
		System.out.println("=================================");
	}
}