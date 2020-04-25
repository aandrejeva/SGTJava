package lessons.lab5;

import java.util.Scanner;
//runner App class for RainfallAvgMaxMin.java

public class RainfallApp {

	public static void main(String[] args) {
		//declare data members/variables
		int rainfall[][];//declare 2D[] to store int elements [row] and [column]
		int weeks;
		int days;
		
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
		
		//formating 
		System.out.println("=======================================");
		System.out.println("TABLE");
		System.out.println();
				
		//formating table
		for(int i = 0; i < days; i++) {
			System.out.print("\t" + "Column");
		}
		System.out.println();
				
		//output in table template
		for(int row = 0; row < rainfall.length; row++) {
			System.out.print("Row" + "\t" + "\t");
			for(int column = 0; column < rainfall[row].length; column++) {
				System.out.print(rainfall[row][column] + "\t" + "\t");
			}
			System.out.println();
		}
				
		//processing
		//declare a variable named rainfallAvgMaxMin and create an object of type RainfallAvgMaxMin
		RainfallAvgMaxMin rainfallAvgMaxMin = new RainfallAvgMaxMin();
		
		//use the setter method to store the numbers provided by the user
		rainfallAvgMaxMin.setRainfall(rainfall);
		
		//call calculation methods
		rainfallAvgMaxMin.averageCalc();
		rainfallAvgMaxMin.maximumCalc();
		rainfallAvgMaxMin.minimumCalc();
		
		
	}//end main

}//end class
