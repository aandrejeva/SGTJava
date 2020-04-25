package lessons.lesson4;

/** CalculatorApp
 -- a simple calculator application to show how to use instantiable classes
 -- the CalculatorApp reuses the instantiable class SimpleCalculator to perform the actual arithmetic operations The class shows:
 -- how to create an object of the instantiable class SimpleCalculator
 -- how to use the setter methods to set/assign values to the instance variables (e.g. firstNumber and secondNumber)
 -- how to use a getter method to retrieve an instance variable's value (e.g. result)
 -- how to use/invoke/call methods on the objects (e.g. calc.setFirstNumber(), calc.multiply(), etc.) */

public class CalculatorApp {

	public static void main(String[] args) {
		
		//create an object of type SimpleCalculator
		SimpleCalculator calc = new SimpleCalculator();
		
		//declare local variables 
		double n1 = 2;
		double n2 = 10;
		
		//store the input of values into the instance variable of object calc
		//setter method called setFirstNumber to set/assign the value of variable n
		
		calc.setFirstNumber(n1);
		calc.setSecondNumber(n2);
		
		calc.display();
		calc.multiply();
		calc.divide();
		calc.display();
		
		double r = calc.getResult();
		
		//output
		System.out.println("long version: " + r);
		System.out.println("short version: " + calc.getResult());
	 
	}//end main

}//end class