package lessons.lab1;

import java.util.*;
/*
Calculates the area of a circle given its radius SaturdayLab1:
Data types. Variables. Constants.
Problem 4 
Write an interactive java program that accepts the radius of a circle from
 the user as input. The program computes and displays the area of the circle.
 Use a constant in the program. Save the program as CircleArea.java.
 Hint: the formula to compute the area of a circle is:
 area = PI * radius * radius */
public class CircleArea {
	
	public static void main(String[] args) {
		
		//declare double radius
		double radius;
		
		//declare double PI
		final double PI = 3.14;
		
		//declare double area
		double area;
		
		//declare a variable of type Scanner
		Scanner sc;
		
		//create an object of type Scanner to take input via keyboard
		sc = new Scanner(System.in);
		
		System.out.println("Please enter radius are: ");
		radius = sc.nextDouble();
		
		//processing
		area = PI * radius * radius; 
		
		//declare output text string
		String outputText = ("The area of a circle with radius is: ");
		
		//output
		System.out.println(outputText + radius + " is " + area);
	}
}
