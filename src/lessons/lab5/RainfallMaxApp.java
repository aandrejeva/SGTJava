package lessons.lab5;

import java.util.Scanner;

/**
2D Arrays Problems
Compute the maximum of the rainfall values stored each day for 4 weeks
 RainfallMaxApp
 -- prompts the user to input the rainfall values for 4 weeks
 -- calculates the maximum of the rainfall
 -- displays the values from the rainfall 2D array
 */
public class RainfallMaxApp {

	public static void main(String[] args) {
		//declare 2D arrays
		double rainfall[][];
		//set the size for 4 week 7 days
		rainfall = new double [4][7];
		
		//ask the user provide dimensions for the array (number of week and days)
		Scanner sc = new Scanner(System.in);
		
		//ask the user provide number of weeks and days
		System.out.println("Please enter number of weeks: ");
		int weeks = sc.nextInt();
		System.out.println("Please enter number of days: ");
		int days  = sc.nextInt();
		
		//create 2D array with as many row as user provided for weeks
		//as many columns as user provided for days
		rainfall = new double [weeks][days];
		
		//input ask the user to input the data
		//traverse the 2D[] by using loop
		//store the value provided by user
		
		for(int row = 0; row < rainfall.length; row++) {
			for(int column = 0; column < rainfall[row].length; column++) {
				System.out.print("Enter rainfall value for week: " + (row+1) + " day " + (column+1) + " :");
				rainfall[row][column] = sc.nextDouble();
			}
		}
		
		//processing
		//calculate the max value in the []
		double max;
		max = rainfall[0][0];
		
		//traverse the 2D[] using outer and inner loop
		for(int row = 0; row < rainfall.length; row++){
			//retrieve the current row, located at the index give by the value of the row variable
			double r[] = rainfall[row];
			//traverse all the element of the current row
			for(int column = 0; column < r.length; column++) {
				//if the value of max variable is lower than the current element from the array
				//from the rainfall[] the update the max with that element
				if(max < rainfall[row][column]) {
					// a new max value has been found
					max = rainfall[row][column]; // store the value of current element in the max
					//the previous value from the max is replaces
				}//end if
			}//end inner loop
		}//end outer loop
		
		//output
		System.out.println("max is: " + max);
		
	}//end main
}//end class
