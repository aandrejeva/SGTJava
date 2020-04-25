package lessons.lab5;

import java.util.Scanner;

/**
2D Arrays Problems
Compute the min of the rainfall values stored each day for week
 RainfallMinApp
 -- prompts the user to input the number of weeks and days
 -- prompts the user to input the rainfall values
 -- calculates the minimum of the rainfall
 -- displays the values from the rainfall 2D array
 */

public class RainfallMinApp {
	
	public static void main(String[] args) {
		//declare and create two dimensional array 2D[]
		int rainfall [][];
		int weeks;
		int days;
		
		//use Scanner, ask the user provide dimensions for the array (number of weeks and days)
		Scanner scanner = new Scanner(System.in);
		
		//ask the user provide the data (number of weeks and days)
		System.out.println("Please enter number of weeks: ");
		weeks = scanner.nextInt(); //to store data provided by user
		while(weeks > 53) {
			System.out.println("Year can't contain more than 53 weeks!");
			System.out.println("Please enter number of weeks: ");//updated input
			weeks = scanner.nextInt(); //to store data provided by user
		}
		
		System.out.println("Please enter number of days: ");
		days = scanner.nextInt(); //to store data provided by user
		while(days > 7) {
				System.out.println("Week can't contain more than 7 days!");
				System.out.println("Please enter number of days: ");//updated input
				days = scanner.nextInt(); //to store data provided by user
		}
		
		//create 2D array with as many rows as user provided for week
		//and as many columns as user provided for days
		rainfall = new int [weeks][days];
		
		//input ask the user to input the data (to initialize the value of elements)
		//traverse the 2D[] by using loop (outer&inner)
		//store the value provided by user
		for(int row = 0; row < rainfall.length; row++) {
			for(int column = 0; column < rainfall[row].length; column++) {
				System.out.print("Please enter the value for week: " + (row+1) + " day " + (column+1) + ": ");
				rainfall[row][column] = scanner.nextInt();//store the value
			}
		}
		
		//formating
		System.out.println("=================");
		System.out.println("TABLE");
		System.out.println();
		
		//formating table
		for(int i = 0; i < days; i++) {
			System.out.print("\t" + "Column");
		}
		System.out.println();
		
		//out print in table template
		for(int row = 0; row < rainfall.length; row++) {
			System.out.print("Row" + "\t" + "\t");
			for(int column = 0; column < rainfall[row].length; column++) {
				System.out.print(rainfall[row][column] + "\t" + "\t");
			}
			System.out.println();
		}
		
		
		//processing
		//calculate the min value in the []
		//declare int min and initialize variable with first value of 2D array located at row 0 and column 0 for the calculation
		int min = rainfall [0][0];
		//traverse the 2D[] using outer and inner loop
		for(int row = 0; row < rainfall.length; row++) {
			//retrieve the current row, located at the index given by the value of the row variable
			//and traverse all the element of the current row
			for(int column = 0; column < rainfall[row].length; column++) {
				//if the value of min variable is higher than the current element from the array
				//from the rainfall[] the update the min with that element
				if(min > rainfall[row][column]) { // a new min value has been found
					min = rainfall [row][column];//store the value of current element in the min
					//the previous value from the min is replaced
				}
			}
		}//end loop
		
		//output
		System.out.println("=================");
		System.out.println("Min number is: " + min);
		
	}//end main
	
}//end class
