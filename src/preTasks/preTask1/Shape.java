package preTasks.preTask1;
/** Write an application that calculates the area and perimeter of a rectangle and displays them to the user.
Use inheritance and polymorphism.
Shape is a class that represents generic geometric shapes
Rectangle class inherits all the non-private data members and methods of the Shape class.
ShapeApp uses the instantiable classes Rectangle (a subclass) and the Shape (a superclass)
to demonstrate the concepts of inheritance and polymorphism in Java.
*/
public class Shape {//inherited/parent class
	//declare instance variables/data members
	private String shapeName;
	protected double area;
	
	//declare constructor with one parameter
	public Shape(String name) {
		this.shapeName = name;
	}
	
	//declare a processing methods to compute variable area
	//this is a generic geometric shape and we can't provide the specific compute method,
	//so by default it's gonna be 0
	public void computeArea() {
		area = 0;
	}

	//declare getter method to retrieve the value of area
	public double getArea() {
		return area;
	}
	
	//declare getter method to retrieve the value of shape name
	public String getShapeName() {
		return shapeName;
	}

	//declare a method to display description and the shape name
	public void printDescription() {
		System.out.println("generic geometric shape: " + getShapeName());
	}
	
	//declare a method to display the properties/state of instance variables of this class
	public void displayMe() {
		System.out.println("_______________");
		System.out.println(shapeName);
		System.out.println(area);
	}
	
}//end class
