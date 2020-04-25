package preTasks.preTask4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
	//Task 1 try to crash our program 
	//trying to access index which is not in our []
		
		//declare an array of type float and assign value to each element, length of array = 3
		float arr[] = new float [] {33.2f, 66.1f, 19.7f}; //index: 0, 1, 2
		//System.out.println(arr[3]); // we try to print out index that does not exist in the array
		
		//we already know what the error is
		//try to catch this error: ArrayIndexOutOfBoundsException
		try {
			//print out the value of index 3 that array does not contain
			System.out.println("Float array of index path 3: " + arr[3]);
		}
		catch (ArrayIndexOutOfBoundsException error) {//catch the exception
			System.out.println("Error:::: " + error);//our app does not crash, because we caught the error
		}
		
	//Task2 arithmetical exception
		boolean continueLoop = true;
		
		Scanner scanner = new Scanner(System.in);
		
		//make do/while loop
		do {
			try {
				//user's input
				System.out.println("Please enter the number: ");
				int numerator = scanner.nextInt();
				
				System.out.println("Please enter the divider number: ");
				int divider = scanner.nextInt();
				
				System.out.println(divide(numerator, divider));
				int res = divide(numerator, divider);
				saveToFile(res); //save to file the result of the method
				
			//catch the exceptions
			//can appear during arithmetic operations
			} catch (ArithmeticException error) {
				System.out.println("ArithmeticException: " + error);
				System.out.println("Only non-zero values is allowed!");
				
			//can appear, when passed parameters are with wrong values	
			} catch (InputMismatchException error) {
				System.out.println("InputMismatchException: " + error);
				System.out.println("Only int values is allowed!");
				continueLoop = false;
			
			//can appear, when an input/output operation is failed or interpreted
			} catch (IOException error) {
				System.out.println("IOException: " + error);
				System.out.println("Could not save the file!");
				
			} finally {//like a default break
				System.out.println("Finally block!");
			}
			
		}while(continueLoop);//run the app while continueLoop is true
		
	}//end main
	
	//declare public static method to return calc result
	public static int divide(int num1, int num2) {
		return num1/num2;
	}
	
	//declare public static method to save the result in the file
	private static void saveToFile(int res) throws IOException {//this method might throw exception
		//PrintWriter - to save in the file
		//FileWriter - file where we gonna save
		PrintWriter writer = new PrintWriter(new FileWriter("test.txt"));
		writer.println("Result::: " + res);//output method
		writer.close();//method to close the file
	}

}//end class
