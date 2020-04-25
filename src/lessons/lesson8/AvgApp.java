package lessons.lesson8;
//here call the calc average to calculate
import java.util.Scanner;

public class AvgApp {

	public static void main(String[] args) {
		//declare an array to store integer elements
		int numbers[];
		
		//declare Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		
		int size = input.nextInt();//provide size of the array
		
		numbers = new int[size];
		
		//input
		//loop to prompt the user to input the numbers 
		//in each iteration of loop to store the number provided by the user in the numbers[] at the index i 
		for(int i = 0; i < size; i++) {
			System.out.println("Enter value " + (i+1));
			numbers[i] = input.nextInt();//store the value inside the array
		}
		
		//processing
		AvgMax avgMax = new AvgMax();
		Avg avg = new Avg();
		AvgMin min = new AvgMin();
		
		//use the setter to store the numbers provided by the user
		avgMax.setNumbers(numbers);
		avg.setNumbers(numbers);
		min.setNumbers(numbers);
		
		avgMax.computeMax();
		avg.calculateAverage();
		min.calculateMin();
		
		//output
		double a = avg.getAverage();
		double b = avgMax.getMax();
		double c = min.getMin();
		
		System.out.println("Average is: " + a);
		System.out.println("Max is: " + b);
		System.out.println("Min is: " + c);
		
	}//end main

}//end class
