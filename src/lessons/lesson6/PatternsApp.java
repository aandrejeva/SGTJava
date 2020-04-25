package lessons.lesson6;

import java.util.Scanner;

/**
Develop an application to display the following patterns, one after another,
using for loops.
� Pattern 1
*
**
***
****
*****
******
� Pattern 2
           *
          **
         ***
        ****
       *****
      ******
Hint: You should use the following statements to print the patterns
� System.out.print('*');
� System.out.print(� ');
� System.out.println();
� You should not use other version of output statements in your program.
TODO: Compile, then run the application to test it for different values of n.
*/
public class PatternsApp {

	public static void main(String[] args) {
		//declare variable
		int n;
		
		Scanner scan = new Scanner(System.in);
		
		//the size of the pattern
		System.out.println("enter a value for n: ");
		n = scan.nextInt();
	/*
	 Pattern 1
	 
		*
		**
		***
		****
		*****
		******
		
	*/
		System.out.println();
		System.out.println("Pattern 1: ");
		System.out.println();
		//two nested loops 
		//outer loop: number of rows
		for (int i = 1; i <= n; i++) {
			//inner loop: to print the columns, to display info for each row
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}//end Pattern 1 loop
		
/*
 Pattern 2
           *
          **
         ***
        ****
       *****
      ******		
 */
		
		System.out.println();
		System.out.println("Pattern 2: ");
		System.out.println();
		//two nested loops 
		//outer loop: number of rows
		for (int i = 1; i <= n; i++) {
			//inner loop: to print the columns, to display info for each row
			for (int j = 1; j <= n; j++) {
				if (i + j < n + 1) {
					System.out.print(" ");
			}else {
				System.out.print('*');
			}	
		}
			System.out.println();
	}//end Pattern 2 loop

		/*
		  Pattern 3 Home Task
		******
		*****
		****
		***
		**
		*
		    */
		System.out.println();
		System.out.println("Pattern 3 Home Task ");
		System.out.println();
		//two nested loops 
		//outer loop: number of rows
		for (int i = 1; i <= n; i++) {
			//inner loop: to print the columns, to display info for each row
			for (int j = 1; j <= n; j++) {
				if (i + j <= n + 1) {
					System.out.print('*');
			}else {System.out.print(" ");}
		}
			System.out.println();
	}//end Pattern 3 loop
			
			
}//end main
}//end class
