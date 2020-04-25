package lessons.lab1;

/**
Calculates the area of a square given a side SaturdayLab1: Data types. Variables. Constants. Problem 2
Write a java program that declares a variable to represent the side of a square.
The side of the square is 7 units. Compute and display the area of the square.
Save the program as Square.java */
//declare a class called Square
public class Square {
	
	//declare main method to run the App
	public static void main(String[] args) {
		
		//input
		int side = 7;
		int area = side*side;
		
		//output
		System.out.println("area of the square: " + area);
	}
}