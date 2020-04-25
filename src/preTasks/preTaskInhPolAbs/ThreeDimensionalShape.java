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

ThreeDimensionalShape
	-- ThreeDimensionalShape is called an abstract class, or more specifically an abstract superclass. 
	-- ThreeDimensionalShape is also a subclass because it inherits from AbsShape superclass.
*/

//declare an abstract class by using the keyword abstract
//also it inherits from AbsShape class
public abstract class ThreeDimensionalShape extends AbsShape{
	//declare data members
	protected double volume;
	
	//declare constructor (it inherits from the super class)
	public ThreeDimensionalShape(String shapeName) {
		super(shapeName);//calling the constructor from the super class
		description = "3D Shape: ";//instance variable description which is available in superclass AbsShape due to inheritance
	}
	
	//declare getter for volume
	public double getVolume() {
		return volume;
	}

	//declare abstract method
	//abstract method always without body
	public abstract void computeVolume();
	
}//end class
