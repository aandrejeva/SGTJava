package lessons.lesson3;
//calculate salary payment based on working hours (standard hours, overtime hours)

public class Payment {
	
	//declare instance variables for the values to be calculated
	private double standardPay;
	private double overtimePay;
	private double totalPay;
	
	//declare method with three parametrs to calculate the payment
	public void calculatePayment(double payRate, double standardHours, double overtimeHours){
		//calculate the overtime payment
		standardPay = payRate * standardHours;
		double overtimePayRate = payRate * 1.5;
		overtimePay = overtimePayRate *overtimeHours;
		totalPay = standardPay + overtimePay;
	}
	
	public void displayPayment(){
		System.out.println("My standard pay: " + standardPay);
		System.out.println("My standard overtime pay: " + overtimePay);
		System.out.println("My total pay: " + totalPay);
	}
	
	public static void main(String[] args) {
		
		//declare a variable of type of Payment
		Payment myPayment; 
		
		//create an object of type Payment
		myPayment = new Payment();
//		double pR, sH, oH;
//		pR = 20;
//		sH = 40;
//		oH = 20;
//		
//		myPayment.calculatePayment(pR, sH, oH);
//		myPayment.displayPayment();
		myPayment.calculatePayment(19.5, 35.0, 12.0);
		myPayment.displayPayment();
		
	}//end main	
}//end class