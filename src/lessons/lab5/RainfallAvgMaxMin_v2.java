package lessons.lab5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
2D Arrays Problems
Compute the average, maximum, minimum of the rainfall values stored in each day for week
 -- prompts the user to input the number of weeks and days
 -- prompts the user to input the rainfall values
 -- calculates the average, maximum, minimum of the rainfall 2D array
 -- displays the values from the rainfall 2D array
 */
public class RainfallAvgMaxMin_v2 {
	//declare data members/instance variables
	private int rainfall[][];//declare 2D[] (the value of [row] and [column] will be provided by the user through Scanner)
	private double average;
	private int minimum;
	private int maximum;
	private int weeks;
	private int days;
	
	public void askUserToInputData() {
		//declare a variable named scanner and create and object of type Scanner
		Scanner scanner = new Scanner(System.in);
			//ask the user to provide dimensions for the array (number of weeks)
			System.out.println("Please enter number of weeks: ");
			weeks = scanner.nextInt(); //to store data provided by user
			while(weeks > 53) {//input check, not more than 53 weeks
				System.out.println("Year can't contain more than 53 weeks!");
				System.out.println("Please enter number of weeks: ");//ask user to update input
				weeks = scanner.nextInt(); //to store data provided by user
			}
			//ask the user provide dimensions for the array (number of days)
			System.out.println("Please enter number of days: ");
			days = scanner.nextInt(); //to store data provided by user
			while(days > 7) {//input check, not more than 7 days per week
				System.out.println("Week can't contain more than 7 days!");
				System.out.println("Please enter number of days: ");//ask user to update input
				days = scanner.nextInt(); //to store data provided by user
			}
			
			//create 2D array with rows [weeks] and columns [days] which is data provided by user
			rainfall = new int [weeks][days];
			
			//input: ask the user to input the data (to initialize the value of elements of 2D[])
			//traverse the 2D[] by using loop (outer&inner)
			//store the values provided by the user
			for(int row = 0; row < rainfall.length; row++) {
				for(int column = 0; column < rainfall[row].length; column++) {
					System.out.print("Please enter value for week: " + (row+1) + " day " + (column+1) + ": ");
				rainfall[row][column] = scanner.nextInt();//read the value entered by the user and save it in 2D[]
				}
			}
	}//end askUserToInputData
	
	
	//method to put and display data in the table form
	public void displayProvidedDataInTable() {
		System.out.println("=======================================");
		System.out.println("TABLE");
		System.out.println();
	
		for(int i = 0; i < days; i++) {
			System.out.print("\t" + "Column");
		}
		System.out.println();
			
	//output in the table form
		for(int row = 0; row < rainfall.length; row++) {
			System.out.print("Row" + "\t" + "\t");
			for(int column = 0; column < rainfall[row].length; column++) {
			System.out.print(rainfall[row][column] + "\t" + "\t");
			}
		System.out.println();
		}
	}//end displayProvidedDataInTable
	
	//calcAverage method
	public void calcAverage() {
		//calculate the number of elements in 2D[] and the sum of all elements
		int sumOfElements = 0;
		int numOfElements = 0;
		//traverse 2D[] using outer and inner loop
		for(int row = 0; row < rainfall.length; row++) {
			for(int column = 0; column < rainfall[row].length; column++) {
				//add current element value from the [] rainfall to the sum to update the sum after each iteration
				sumOfElements = sumOfElements + rainfall[row][column];
				numOfElements++;//update number of elements in the rainfall[row][column] after each iteration
			}
		}
		//calculate the average of all elements value in the [] and convert to double with 2 decimal signs
		average = (double)sumOfElements/numOfElements;
		DecimalFormat df = new DecimalFormat("####0.00");
		
		//output
		System.out.println("=======================================");
		System.out.println("Average: " + df.format(average));
	}//end calcAverage
	
	
	//calcMaximum method
	public void calcMaximum() {
		maximum = rainfall[0][0];//initialized the maximum with the first elements of the array with index 0
		
		//traverse 2D[] using outer and inner loop
		for(int row = 0; row < rainfall.length; row++) {
			//retrieve the current row located at the index given by the row variable [row]
			//and traverse all the elements at current row
			for(int column = 0; column < rainfall[row].length;column++) {
				//if the value of maximum variable is lower than the current element value
				//from the rainfall[] then update the maximum with that element value
				if(maximum < rainfall[row][column]) {
					maximum = rainfall[row][column];//updated maximum value
				}
			}
		}	
		//output
		System.out.println("Maximum: " + maximum);
	}//end calcMaximum
	
	//calcMinimum method
	public void calcMinimum() {
		minimum = rainfall[0][0];//initialized the minimum with the first elements of the array with index 0
		
		//traverse 2D[] using outer and inner loop
		for(int row = 0; row < rainfall.length; row++) {
			//retrieve the current row located at the index given by the row variable [row]
			//and traverse all the elements at current row
			for(int column = 0; column < rainfall[row].length; column++) {
				//if the value of minimum variable is higher than the current element value
				//from the rainfall[] then update the minimum with that element value
				if(minimum > rainfall[row][column]) {
					minimum = rainfall[row][column];//updated minimum value
				}
			}
		}
		//output
		System.out.println("Minimum: " + minimum);
	}//end calcMinimum
	
}//end class

