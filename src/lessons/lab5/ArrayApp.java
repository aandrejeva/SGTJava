package lessons.lab5;

import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		// declare two dimensional array
		int array [][] = new int [][] {{1,2,3}, {4,5,6}, {7,8,9}};
		
		/*the out print:
		 c
		 o
		 l
		 u
		 m
		 n
	row  1 2 3
		 4 5 6
		 7 8 9
		*/
//		System.out.println(array[2][2]);
		
		for(int row = 0; row < array.length; row++) {//outer loop for the row
			for(int column = 0; column < array[row].length; column++) {//inner loop to access the column
				System.out.print(array[row][column] + " ");//make space after each loop
			}
			System.out.println();
		}
		
		//declare Scanner
		Scanner input = new Scanner(System.in);
		ArrayDemo myArr = new ArrayDemo();
		
		myArr.setNums(array);
		
		//use Scanner inside the loop
		for(int row = 0; row < array.length; row++) {//outer loop for the row
			for(int column = 0; column < array[row].length; column++) {//inner loop to access the column
				System.out.println("Please enter a number");
				int num = input.nextInt();
				myArr.setArrayNumber(row, column, num);
			}
		}
		
		//output
		for(int row = 0; row < array.length; row++) {
			for(int column = 0; column < array[row].length; column++) {
			System.out.print(array[row][column] + " ");
		}
			System.out.println();
	}
		
	}//end main

}//end main
