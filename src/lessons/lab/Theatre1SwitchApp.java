package lessons.lab;

import java.util.Scanner;

/*
 *-- prompts the user to input a day
 *-- uses the instantiable class Theatre1Switch to determine the actual cost of a theatre ticket based on the given day
 */
public class Theatre1SwitchApp {

	public static void main(String[] args) {
		
		//declare a local variable named weekDay to store the day of week provided by the user
		String weekDay;
		
		//declare a variable named input, and create and object of type Scanner;
		Scanner input = new Scanner(System.in);
		
		//declare a variable and create an object of type Theatre1Switch
		Theatre1Switch theatrePriceChecker = new Theatre1Switch();
		
		//input, prompt the user to enter a day name
		System.out.println("Enter the day of week: ");
		weekDay = input.next();
		
		//processing
		//call displayTicketPrice method to display a ticket price
		theatrePriceChecker.displayTicketPrice(weekDay);
		
		

	}

}
