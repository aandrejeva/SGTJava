package lessons.lab1;

/*
Calculates the arithmetic operations
SaturdayLab1: Data types. Variables. Constants.
Problem 3
Save file as Numbers.java
 -- arithmetic operations with int and double operands (i.e. variables)
 -- mixed addition
 -- integer division. double division. mixed division */
//declare a class called Numbers
public class Numbers {
	
	//declare main method to run the App
	public static void main(String[] args) {
		
		//declare variable of type int
		int iNumOne, iNumTwo, iResult;
		
		//declare variable of type double
		double dNumOne, dNumTwo, dResult;
		
		//assign/store
		iNumOne = 5;
		iNumTwo = 2;
		dNumOne = 10.0;
		dNumTwo = 11.5;
		
		// sum
		iResult = iNumOne + (int) dNumOne;
		dResult = dNumTwo + iNumOne;
		
		String intResult = "int result: ";
		String doubleResult = "double result: ";
		System.out.println(intResult + iResult);
		System.out.println(doubleResult + dResult);
		
		//multiplication int
		iResult = (int) dNumTwo * iNumTwo;
		System.out.println(intResult + iResult);
		
		//multiplication double
		dResult = dNumOne * iNumOne;
		System.out.println(doubleResult + dResult);
		
		//substraction int
		iResult = (int) dNumTwo - iNumTwo;
		System.out.println(intResult + iResult);
		
		//substraction double
		dResult = dNumOne - iNumOne;
		System.out.println(doubleResult + dResult);
		
		//division int
		iResult = (int) dNumTwo / iNumTwo;
		System.out.println(intResult + iResult);
		
		//division double 
		dResult = dNumTwo / iNumTwo;
		System.out.println(doubleResult + dResult);
		dResult = (double) (iNumOne - iNumTwo);
		System.out.println(doubleResult + dResult);
	}
}
