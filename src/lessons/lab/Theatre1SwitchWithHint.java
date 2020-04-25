package lessons.lab;
/*
More Problems on Selection Statements
Problem 1: 
Your local theatre charges different prices during the week and during the weekends.  The prices are outlined in the table below:
Day:				Price:
Monday - Thursday		�20
Friday - Sunday			�30
You have been asked to develop an application that allows a user to enter the day of the week and then display the cost of a theatre ticket for that person based on the day of the week. 
Use instantiable classes in your application.  Save the instantiable class as Theatre1IfWithHint.java
 */
public class Theatre1SwitchWithHint {
	//declare instance variables 
	private String day; // declare instance variable to store the day
	private int mondayTillThursdayPrice; // declare instance variable to store the price of a ticket based on the given day
	private int fridayTillSundayPrice; // declare instance variable to store the price of a ticket based on the given day

	// Constructor - initialize the day with the empty string;
	// by default the day instance variable is initialized with null;
	// the price will be initialized with zero
		
	// declare a setter method for each of the instance variables that can be set/ assigned a value
	// setter method for the day instance variable
	public void setMondayTillThursdayPrice(int price) {
		mondayTillThursdayPrice = price;
	}
	public void setFridayTillSundayPrice(int price) {
		fridayTillSundayPrice = price;
	}
		
	public void setDay(String day) {
		this.day = day;
	}
		
	// declare a getter method for each of the instance variables
	// whose values should be made available to the other classes
	// that use this instantiable class
	// for example, the class with the main() method which uses this instantiable class
	// (i.e. Theatre1IfWithHint.java) would use the getter method to retrieve the price of a ticket
	// getter method to retrieve the ticket price
		
	public String getDay() {
		return day;
	}
		
	public int getMondayTillThursdayPrice() {
		return mondayTillThursdayPrice;
	}
		
	public int getFridayTillSundayPrice() {
		return fridayTillSundayPrice;
	}
		
	// the method which does the actual processing: based on a given day determines the price of the ticket
    // the program should work irrespective of the way the day is written
    // (e.g. lower case, upper case or a combination of the two)
    // therefore we must convert all the letters to either lower case or upper case
    // convert the way the day is written to lower case and store the result into the instance variable day
    // we can store the lower case version in the instance variable day
    // because we do not need the previous content (i.e. value) of that variable
    // because we converted the day to lower case the selection statement
    // should check the day against lower case Strings that represent the names of the days
    // uses the if selection statement to determine the price of a theatre ticket
    // based on a given day
    // why is this else branch needed? -- if the user entered an invalid day then we should not provide a valid price for the ticket
		
	
	//processing
	//declare the processing method
	public void displayTicketPrice() {
		switch (day.toLowerCase()) {
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		System.out.println("The ticket price is " + mondayTillThursdayPrice + " Eur");
		break;
		
		case "friday":
		case "saturday":
		case "sunday":
		System.out.println("The ticket price is " + fridayTillSundayPrice + " Eur");
		break;
		
		default:
		System.out.println("Please check the input");

	}//end displayTicketPrice method
	
	}//end main
} //end class

