package lessons.lab5;

import java.text.DecimalFormat;
/**
2D Arrays Problems
Compute the average, maximum, minimum of the rainfall values stored in each day for week
 -- prompts the user to input the number of weeks and days
 -- prompts the user to input the rainfall values
 -- calculates the average, maximum, minimum of the rainfall 2D array
 -- displays the values from the rainfall 2D array
 */
public class RainfallAvgMaxMin {
	//declare data members/instance variables
	private int rainfall[][];//declare 2D[] (the value of [row] and [column] will be provided by the user through Scanner)
	private double average;
	private int minimum;
	private int maximum;
	
	//declare set method to store 2D array of int elements in the instance variable rainfall
	public void setRainfall(int rainfall[][]) {
		this.rainfall = rainfall;
	}
	
	//averageCalc method
	public void averageCalc() {
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
	}//end averageCalc
	
	
	//maximumCalc method
	public void maximumCalc() {
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
	}//end maximumCalc
	
	//minimumCalc method
	public void minimumCalc() {
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
	}//end minimumCalc
	
	
	
}//end class
