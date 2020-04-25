package lessons.lab;
/** 
More Problems on Selection Statements
Problem 1: 
Your local theatre charges different prices during the week and during the weekends.  The prices are outlined in the table below:
Day:				Price:
Monday - Thursday		�20
Friday - Sunday			�30
You have been asked to develop an application that allows a user to enter the day of the week and then display the cost of a theatre ticket for that person based on the day of the week. 
Use instantiable classes in your application.  Save the instantiable class as Theatre1If.java
Theatre1IfApp.java 
	-- prompts the user to input a day
	-- uses the instantiable class Theatre1If to determine the actual cost of a theatre ticket based on the given day
*/
public class Theatre1If {
	//declare instance variables
	private int mondayTillThursdayPrice = 20;
	private int fridayTillSundayPrice = 30;

	//declare the processing method
public void displayTicketPrice(String day) {
	day = day.toLowerCase();
	if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday")) {
		System.out.println("The ticket price is " + mondayTillThursdayPrice + " Eur");
	} else if(day.equals("friday") || day.equals("saturday") || day.equals("sunday")){
		System.out.println("The ticket price is " + fridayTillSundayPrice + " Eur");
	} else { 
		System.out.println("Please check the input");
	}
	
} //end displayTicketPrice method

}//end class
