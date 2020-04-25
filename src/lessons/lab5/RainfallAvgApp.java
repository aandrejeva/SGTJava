package lessons.lab5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
2D Arrays Problems
Compute the average of the rainfall values stored each day for 4 weeks
 RainfallAvgApp
 -- prompts the user to input the rainfall values for 4 weeks
 -- calculates the average of the rainfall
 -- displays the values from the rainfall 2D array
 */
public class RainfallAvgApp {

	public static void main(String[] args) {
		//declare and create two dimensional array 2D[] with 4 weeks (rows) each 7 days (column)
		int rainfall[][] = new int [4][7]; //declare 2D array
		
		//input
		Scanner sc = new Scanner(System.in);
		//ask the user to input the data
		//traverse the 2D[] by using outer and inner loop
		//to store the values provided by the user
		for(int row = 0; row < rainfall.length;row++) {
			for(int column = 0; column < rainfall[row].length; column++) {
				System.out.print("Please enter value for week: " + (row+1) + " day " + (column+1) + " :");
				
				//read the value entered by the user and save it in 2D[]
				rainfall[row][column] = sc.nextInt();
			}
		}
		
		//processing
		//calculate the sum of all elements of the array
		//we should know how many elements the array contains
		
		int sum = 0;
		int counter = 0;// the number of elements in the 2D array
		double average;//to store result
		
		//calculation
		for(int row = 0; row < rainfall.length; row++) {
			for(int column = 0; column < rainfall[row].length; column++) {
				//add the current element form the array rainfall to the sum to update sum
				sum = sum + rainfall[row][column];
				// another element has been added to the sum
				//the element from array [row][column]
				counter++;
			}
		}
		
		//calculation of average of all the element in the array
		average = (double)sum/counter;
		
		//output
		System.out.println("===============");
		//System.out.println("Average: " + average);
		DecimalFormat df = new DecimalFormat("####0.00");
		System.out.println("Average: " + df.format(average));
		
		//output the 2D[] - the data user entered
		System.out.println("===============");
		System.out.println("The rainfall values are: ");
		for(int row = 0; row < rainfall.length; row++) {
			for(int column = 0; column < rainfall[row].length; column++) {
				//retrieve the element from the [] located at the row and column
				System.out.print(rainfall[row][column] + " ");
			}
			System.out.println();
		}

		
	}//end main
}//end class