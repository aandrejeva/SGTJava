package lessons.lesson5;
/*
 SmartNumber.java computes property value of number
 */
public class SmartNumber {

	// declare a constructor 
	public SmartNumber() {
		System.out.println("Starting the app...");
		System.out.println();
	}
	
	//compute whether the number is even. Return true if the number is even, otherwise returns false
	public boolean isNumberEven(int number) {
		//declare a variable to store weather the number is evens
		boolean isEven = false;
		int reminder = number % 2;
		
		if (reminder ==0) {
			isEven = true;
		}
		return isEven;
	}
	

}
