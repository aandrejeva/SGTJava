package lessons.revision;

import java.util.Scanner;

public class ExchangeApp { //runner class

	public static void main(String[] args) {
		
		//declare local variables of type double (amount, rate, conversion)
		double amount;
		double rate;
		double conversion;
		
		//declare a variable named scanner and create and object of type Scanner
		Scanner scanner = new Scanner(System.in);
		
		//input
		System.out.println("\tPlease enter amount to be converted: ");// \t - tab
		//store the user input inside the local variable amount
		amount = scanner.nextDouble();
	
		System.out.println("\nPlease enter \nthe conversion rate: ");// \n - put on the new line
		//store the user input inside the local variable rate
		rate = scanner.nextDouble();
		
		//declare a variable exchange and create an object of type Exchange
		Exchange exchange = new Exchange(amount, rate);
		
		//setMethod to put scanner value
		exchange.setAmount(amount);
		exchange.setRate(rate);
	
		//process
		exchange.computeConversion();
		
		//the output
		//call getMethod to get the conversion result
		conversion = exchange.getConversionResult();
		
		System.out.println("Result: " + amount + " at a rate of " + rate + " is " + conversion);// w/o tabs

	}//end main

}//end class
