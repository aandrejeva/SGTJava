package lessons.lesson8;

import java.util.Scanner;

//homework: app runner class
public class CalcApp {

	public static void main(String[] args) {
		//declare an array of type int named numbers to store int elements
		int [] numbers;
		
		//declare a variable named scanner and create and object of type Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input number of elements in array: ");
		int numOfElements = scanner.nextInt();//assign the users input from keyboard to variable named numOfElements
		numbers = new int [numOfElements]; //create an array and assign it to numbers reference
		
		//input
		//loop to prompt the user to input the numbers to initialize an array element value at index i in each iteration of loop
		for(int i = 0; i <= numbers.length-1; i++) {
			System.out.println("Please enter the number " + (i+1) + " :");
			numbers[i] = scanner.nextInt();//to store the value in the element of index i
		}
		
		//processing
		//declare a variable named3 avgMaxMin and create new objects of type AvgMaxMin
		AvgMaxMin avgMaxMin = new AvgMaxMin();
		
		//use the setter method to store the numbers provided by the user
		avgMaxMin.setNumbers(numbers);
		
		//call calculation methods
		avgMaxMin.averageCalc();
		avgMaxMin.minimumCalc();
		avgMaxMin.maximumCalc();
		
		//output 
		//use the getter method to get the calculated numbers
		System.out.println("The average number is: " + avgMaxMin.getAvg());
		System.out.println("The minimum number is: " + avgMaxMin.getMin());
		System.out.println("The maximum number is: " + avgMaxMin.getMax());
				
		
	}//end main

}//end class
