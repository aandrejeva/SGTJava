package lessons.lesson8;

import java.util.Scanner;

/**
Develop an application that accepts 5 integers from the user and stores them in an array.
The application should then calculate and output the average number in the array.
Save the class as AverageApp.java
*/
public class AverageApp {

	public static void main(String[] args) {
		//declare an array named numbers with 5 elements
		int numbers[] = new int[5]; // can write also int[] numbers = new int[5];
		
		//declare scanner
		Scanner input = new Scanner(System.in);
		//input 
		//for loop to prompt the user input 5 times a number 
		//each interaction of the loop will store the number provided by the user
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter number: ");
			numbers[i] = input.nextInt();
		}
		
		//process
		//calculate the average of all the numbers from the array
		double avg;
		int sum = 0;
		
		int counter = numbers.length;
		
		//traverse the array to calculate the sum of all the numbers[]
		for(int i = 0; i < counter; i++) {
			sum = sum + numbers[i];//in each interaction add the current element
			//which is stored in the array at index i to sum  
		}
		
		//compute the average
		avg = (double) sum/counter;
		
		//output
		System.out.println("average number is: " + avg);
		
		//display the content of the array
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Number " + (i + 1) + " is : " + numbers[i]);
		}
		
	}//end main

}//end class
