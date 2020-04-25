package lessons.lesson8;

import java.util.Scanner;

public class OneDimentionalArray {

	public static void main(String[] args) {
		//initialized an array which can store 5 elements
		int[] myArray = new int[6];
		//to store int inside [], we need to specify index (i)
		myArray[0] = 0;
		myArray[1] = 23;
		myArray[2] = 33;
		myArray[3] = 13;
		myArray[4] = 233;
		myArray[5] = 123;
		
		//System.out.println(myArray[5]);
		
		//another initialization 
		int[] myNewArray = {4,5,6,7,8};
		//System.out.println(myNewArray[2]);
		
		for(int i = 0; i < myNewArray.length; i++) {
			//System.out.println("Element of # " + i + " = " + myNewArray[i]);
		}
		
		//declare a Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 3 int elements");
		int[] intArray = new int[3];
		for(int j = 0; j < intArray.length; j++) {
			System.out.println("Enter element here: ");
			intArray[j] = sc.nextInt();
			System.out.println("You just entered " + intArray[j] + " to element of #" + j);
		}
		System.out.println("====================");
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("Element of # " + i + " = " + intArray[i]);
		}
		
	}//end main

}//end class
