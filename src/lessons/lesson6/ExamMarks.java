package lessons.lesson6;

import java.util.Scanner;

/**
calculates exams average mark
A class of students took an exam. Develop an application that takes an
arbitrary number of marks (i.e. we do not know the exact number of marks,
that is the user decides when there are no marks to be entered) and calculates
and displays the average mark of the entire class on the exam. The marks
are integers in the range [0,100].
TODO: Compile, then run the application to test it for different marks values.
*/
public class ExamMarks {
	
	public static void main(String[] args) {
		
		//declare local variable 
		int sum = 0;
		int counter = 0;
		double average;
		
		String ans = "yes";
		
		Scanner sc = new Scanner(System.in);
		
		while (ans.equals("yes")) { //loop condition
			System.out.println("Please enter the mark: ");
			int mark = sc.nextInt();
			
			sum += mark; // add to current sum the new mark
			counter++; // increment the number of marks entered so far
			
			System.out.println("Do you enter another mark? (type yes to continue)");
			ans = sc.next();
			ans = ans.toLowerCase();
		} //end while loop
		
		// at this stage all the marks have been entered, compute the average mark
		average = (double) sum/counter;
		System.out.println("average" + average);
		
		
	}//end main
}//end class
