package preTasks.preTaskInhPolAbs;
/** Lab: Inheritance. Polymorphism. Abstract Classes.:
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
	-- Cube is a subclass, ThreeDimensionalShape is its direct superclass and AbsShape is its indirect superclass
*/

//a subclass that inherits from ThreeDimensionalShape and AbsShape super classes
public class Cube extends ThreeDimensionalShape{
	//declare data members
	private double edge;//length of the cube
	
	//generate constructor
	public Cube(String shapeName, double edge) {
		super(shapeName);//call the constructor of the superclass
		this.edge = edge;
	}

	//override abstract method from the abstract super class ThreeDimensionalShape
	@Override
	public void computeVolume() {
		volume = edge * edge *edge;
	}

	//override abstract method from the abstract super class AbsShape
	@Override
	public void computeArea() {
		area = 6 * edge * edge;
	}

}//end class
