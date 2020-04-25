package lessons.lab1;
/**
Carpet.java calculates the cost of carpeting a room
SaturdayLab1: Data types. Variables. Constants. Problem 1.
Write a java class that declares variables to represent the length and the
width of a room and the price of carpet per metre in euros.
Compute and display the cost of carpeting the room. Save the class as Carpet.java.
*/
//declare a class called Carpet
public class Carpet {
	
	//declare main method to run the App
	public static void main(String[] args) {
		
		//declare the variables to represent length, width, price
		int length, width, price;
		
		//input
		length = 4;
		width = 8;
		price = 12;
		
		//processing
		//to store and calculate area of the room
		int area;
		area = width * length;
		int cost;
		cost = area * price;
		
		//output
		System.out.println("total cost is " + cost + "EUR");
	}
}