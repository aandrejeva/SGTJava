package lessons.lab;

import java.util.Scanner;

//-- prompts the user to input a day
//-- uses the instantiable class Theatre1If to determine the actual cost of a theatre ticket based on the given day

public class Theatre1IfAppWithHint {

	public static void main(String[] args) {
		
		String day; // declare a variable to store the day entered by the user
		
		// declare a variable named t and create an object of type Theatre1IfWithHint
		Theatre1IfWithHint t = new Theatre1IfWithHint();
		t.setMondayTillThursdayPrice(20);
		t.setFridayTillSundayPrice(30);
        // create an object of type Scanner to allow input from the keyboard
		Scanner input = new Scanner(System.in);
		
        // input
        // prompt the user to input a day
		System.out.println("Enter the day of week: ");
        // reads a single word from the keyboard
		day = input.next();
		
        // use (i.e. by calling/invoking) the setter method setDay()
        // to store in the instance variable named day of the object t the day provided by the user
		t.setDay(day);
		
        // processing: calculate the price of a ticket in the given day
		t.displayTicketPrice();
		
        // output
        // invoke/call the getter method getPrice() to retrieve the cost of the ticket
		System.out.println("================================================");
		System.out.println("Ticket price from Monday till Thursday is " + t.getMondayTillThursdayPrice() + " EUR");
		System.out.println("Ticket price from Friday till Sunday is " + t.getFridayTillSundayPrice() + " EUR");
		
        // it is not mandatory, but we can display a user friendly message in case that the day is not valid,
        // and therefore there is a negative value in the p variable
        // (recall that the calculatePrice() method of the Theatre1If class assigns/stores in the price instance variable if the day is invalid)
		
	}//end main

}//end class
