package lessons.lab;
//the instantiable class, uses the switch selection statement to determine the price of a theatre ticket based on a given day
public class Theatre1Switch {
	
	//declare instance variables
		private int mondayTillThursdayPrice = 20;
		private int fridayTillSundayPrice = 30;
		
		//declare the processing method
		public void displayTicketPrice(String day) {
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
		
		}//end switch

	}//end displayTicketPrice method
		
}//end class