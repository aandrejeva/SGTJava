package lessons.lesson5;
import java.util.*;

public class IfCalculatorValidation {
	public static void main(String[] args) {
//input
		//prompt user to specify the operation to be performed
		System.out.println("Choose Operation!");
		System.out.println("addition -- 1: ");
		System.out.println("substruction -- 2: ");
		System.out.println("multiplication -- 3: ");
		System.out.println("devidion -- 4: ");
		
		//declare and create an object of type Scanner
		Scanner input = new Scanner(System.in);
		
		//declare local variable to store the users choice
		int operations = input.nextInt(); //read and return 1 int value
		
		if (operations != 1 && operations != 2 && operations != 3 && operations != 4) {
			System.out.println("Check your operations numbers. ");
		}else {// otherwise, if operation is valid execute next statement {body}
			System.out.println("Please enter 1st number: ");
			double n1 = input.nextDouble();
			
			System.out.println("Please enter 2nd number: ");
			double n2 = input.nextDouble();
			
			//declare and create type of object SimpleCalculator 
			SimpleCalculator myCalc = new SimpleCalculator ();
			
			//use the setter method to store the value n1 to the firstNumber of instance variable
			myCalc.setFirstNumber(n1);
			//use the setter method to store the value n2 to the secondNumber of instance variable
			myCalc.setSecondNumber(n2);
			
			//process
			if (operations == 1) {
				//call add() method on the object to perform the addition
				myCalc.add();
			}else if (operations == 2){
				//call subtract() method on the object to perform the subtract
				myCalc.subtract();
			}else if (operations == 3) {
				//call multiply() method on the object to perform the multiply
				myCalc.multiply();
			}else if (operations == 4) {
				//call divide() method on the object to perform the divide
				myCalc.divide();
			}
				//output
			double res = myCalc.getResult();
			System.out.println("Result: " + res);
				
			}// end else
		
	} //end  main	
} //end class