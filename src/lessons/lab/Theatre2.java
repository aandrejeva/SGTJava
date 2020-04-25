package lessons.lab;
/** 
More Problems on Selection Statements
Problem 2: 
The theatre has now decided to charge based both on the day of the week and on the age of the customer. The new table of prices is outlined below:
Day:				    Age			    Price:
Monday - Thursday   Under 5/Over 65		Free
                    5 � 15			    �15
                    15 - 65			    �20
Friday - Sunday		Under 5/Over 65		�5
                    5 � 15			    �20
                    15 - 65			    �30
Use instantiable classes in your application. Save the instantiable class as Theatre2.java
Theatre2 -- the instantiable class, uses 2 nested if else selection statements to determine the cost of a theatre ticket based on a given day and a customer's age
*/
public class Theatre2 {
	// declare instance variable to store the price of a ticket based on the given day and age
	private int mondayThursdayUnder5Over65Price;
	private int mondayThursdayFrom5To15Price;
	private int mondayThursdayFrom15To65Price;
	private int fridaySundayUnder5Over65Price;
	private int fridaySundayFrom5To15Price;
	private int fridaySundayFrom15To65Price;
	
	//create constructor to assign variables to object when object is created
	Theatre2(int mondayThursdayUnder5Over65Price, 
			int mondayThursdayFrom5To15Price,
			int mondayThursdayFrom15To65Price,
			int fridaySundayUnder5Over65Price,
			int fridaySundayFrom5To15Price,
			int fridaySundayFrom15To65Price) {
		
		this.mondayThursdayUnder5Over65Price = mondayThursdayUnder5Over65Price;
		this.mondayThursdayFrom5To15Price = mondayThursdayFrom5To15Price;
		this.mondayThursdayFrom15To65Price = mondayThursdayFrom15To65Price;
		this.fridaySundayUnder5Over65Price = fridaySundayUnder5Over65Price;
		this.fridaySundayFrom5To15Price = fridaySundayFrom5To15Price;
		this.fridaySundayFrom15To65Price = fridaySundayFrom15To65Price;
	}

	//processing method that displays the ticket price according to day of week and customer age
	public void displayTicketPrice(String day, int customerAge) {
		day = day.toLowerCase();
		if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday")) {
			if(customerAge < 5 || customerAge >= 65) {
				System.out.println("The ticket price is " + mondayThursdayUnder5Over65Price + " Eur");
			}
			if(customerAge >= 5 && customerAge < 15) {
				System.out.println("The ticket price is " + mondayThursdayFrom5To15Price + " Eur");
			}
			if(customerAge >= 15 && customerAge < 65) {
				System.out.println("The ticket price is " + mondayThursdayFrom15To65Price + " Eur");
			}
		}// end if
		
		else if(day.equals("friday") || day.equals("saturday") || day.equals("sunday")) {
				if(customerAge < 5 || customerAge >= 65) {
					System.out.println("The ticket price is " + fridaySundayUnder5Over65Price + " Eur");
				}
				if(customerAge >= 5 && customerAge < 15) {
					System.out.println("The ticket price is " + fridaySundayFrom5To15Price + " Eur");
				}
				if(customerAge >= 15 && customerAge < 65) {
					System.out.println("The ticket price is " + fridaySundayFrom15To65Price + " Eur");
				}
		} // end if
		else {
			System.out.println("Please check the input");
		} // end else
		
	} //end displayTicketPrice method
	
}//end class
	

