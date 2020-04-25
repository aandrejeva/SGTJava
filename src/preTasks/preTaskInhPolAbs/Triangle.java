package preTasks.preTaskInhPolAbs;
/** Lab: Inheritance. Polymorphism. Abstract Classes.
Problem 2
Task1: Extend the example shown during class, to create an
inheritance hierarchy for geometrical shapes as depicted on
the next slide. There is a superclass named AbsShape, the
superclass of all geometrical shapes. There are two other
classes that generically represent all the 2D and 3D
geometrical shapes respectively. For the 2D geometrical
shapes implement the classes Circle and Triangle. For the 3D
geometrical shapes implement the classes Cube and Sphere.
The 2D geometrical shapes contain methods to compute their
area and perimeter. The 3D geometrical shapes contain
methods to compute their surface area and volume.
Use inheritance and abstract classes.
Triangle
	-- Triangle is a subclass, TwoDimensionalShape is its direct superclass and AbsShape is its indirect superclass
*/

//a subclass that inherits from TwoDimensionalShape and AbsShape super classes
public class Triangle extends TwoDimensionalShape{
	//data members/instance variables
	private double side1;
	private double side2;
	private double side3;
	
	//generate the constructor
	public Triangle(String shapeName, double side1, double side2, double side3) {
		super(shapeName);//calls the constructor of the superclass TwoDimenssionalShape
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	//override abstract method from the abstract super class TwoDimensionalShape
	@Override
	public void computePerimeter() {
		perimeter = side1 + side2 + side3;
	}

	//override abstract method from the abstract super class AbsShape
	@Override
	public void computeArea() {
		
		//heron's formula required the perimeter of the triangle
		computePerimeter();
		double halfPerimeter = perimeter/2;
		
		area = Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
	}

	
}//end class
