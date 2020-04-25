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

AbsShape
	-- AbsShape is called an abstract class, or more specifically is an abstract superclass.
Note: we call this class AbsShape and not Shape, to avoid overwriting the class Shape we developed together during class.
*/

// declare an abstract class by using the keyword abstract
// Note: recall from the example shown in class that we cannot create objects of an abstract class (i.e. an abstract class is not instantiable)
public abstract class AbsShape {
	//declare data members/variables
	private String shapeName;
	protected String description;
	protected double area;
	
	//generate constructor with one parameter
	public AbsShape(String shapeName) {
		this.shapeName = shapeName;
	}

	//declare getters for all variables
	public String getShapeName() {
		return shapeName;
	}

	public String getDescription() {
		return description;
	}

	public double getArea() {
		return area;
	}
	
	//declare abstract method, there is no method body
	//for 2D shapes and 3D shapes will be completely different compute methods
	public abstract void computeArea();
	
}//end class
