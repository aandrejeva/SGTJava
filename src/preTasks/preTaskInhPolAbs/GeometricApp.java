package preTasks.preTaskInhPolAbs;
/** Lab: Inheritance. Polymorphism. Abstract
Problem 2
Task2: Develop an application named GeometricApp to create the geometric shapes previously defined. The application should
create objects of each geometric type and display the properties (e.g. area, perimeter, volume) of each geometric shape.
Task3: Practice polymorphism and the instanceof keyword by declaring several variables of the 
superclass type and creating objects of the subclass type, and then calling specific methods on the objects. (follow the example shown in class � available also in the lecture slides)
e.g. AbsShape s1, s2;
s1 = new Triangle();
s2 = new Circle();
*/
public class GeometricApp {

	public static void main(String[] args) {
		//declare a variable of type AbsShape
		AbsShape absShape;// we can't create an object of abstract class
		
		//Task2
		//Develop an application named GeometricApp to create the geometric shapes previously defined. The application should
		//create objects of each geometric type and display the properties (e.g. area, perimeter, volume) of each geometric shape.
		System.out.println("========Inheritance========");
		Circle myCircle = new Circle("Circle", 3); //(shapeName, radius);
		Triangle myTriangle = new Triangle("Triangle", 3, 4, 5); //(shapeName, side1, side2, side3);
		Cube myCube = new Cube("Cube", 4); //(shapeName, edge);
		Sphere mySphere = new Sphere("Sphere", 4); //(shapeName, radius);
		
		//processing
		//call the compute methods of each object 
		//area is calculated for all geometric shapes, perimeter only for 2D g.shape and volume only for 3D g.shape
		myCircle.computeArea();
		myCircle.computePerimeter();
		
		myTriangle.computeArea();
		myTriangle.computePerimeter();
		
		myCube.computeArea();
		myCube.computeVolume();
		
		mySphere.computeArea();
		mySphere.computeVolume();
		
		//output
		//call methods on the object, methods below are inherited from super class
		//the var description is defined in the TwoDimensionalShape class, but the method getDescription() is declared in the super class AbsShape
		String desc = myCircle.getDescription(); //inherits from AbsShape class
		String name = myCircle.getShapeName(); //inherits from AbsShape class
		double value = myCircle.getArea(); //inherits from AbsShape class
		System.out.println(desc + name + ", area: " + value);
		value = myCircle.getPerimeter(); //inherits from TwoDimensionalShape class
		System.out.println(desc + name + ", perimeter: " + value);
		
		//reuse local variable declared
		desc = myTriangle.getDescription();
		name = myTriangle.getShapeName();
		value = myTriangle.getArea();
		System.out.println(desc + name + ", area: " + value);
		value = myTriangle.getPerimeter();
		System.out.println(desc + name + ", perimeter: " + value);
		
		desc = myCube.getDescription();
		name = myCube.getShapeName();
		value = myCube.getArea();
		System.out.println(desc + name + ", area: " + value);
		value = myCube.getVolume();
		System.out.println(desc + name + ", volume: " + value);
		
		desc = mySphere.getDescription();
		name = mySphere.getShapeName();
		value = mySphere.getArea();
		System.out.println(desc + name + ", area: " + value);
		value = mySphere.getVolume();
		System.out.println(desc + name + ", volume: " + value);
		
		//Task3:
		//Practice polymorphism and the instanceof keyword by declaring several variables of the 
		//superclass type and creating objects of the subclass type, and then calling specific methods on the objects.
		System.out.println();
		System.out.println("========Polymorphism========");
		AbsShape absShape1, absShape2, absShape3, absShape4;
		absShape1 = new Circle("one more circle", 9);
		absShape2 = new Triangle("one more triangle", 8, 7, 6);
		absShape3 = new Cube("one more cube", 6);
		absShape4 = new Sphere("one more sphere", 2.5);
		
		//processing
		//at run time java calls the correct computeArea() of the instance object that is referred from each variable
		absShape1.computeArea();
		absShape2.computeArea();
		absShape3.computeArea();
		absShape4.computeArea();
		
		//output
		System.out.println(absShape1.getDescription() + absShape1.getShapeName() + " area: " + absShape1.getArea());
		System.out.println(absShape2.getDescription() + absShape2.getShapeName() + " area: " + absShape2.getArea());
		System.out.println(absShape3.getDescription() + absShape3.getShapeName() + " area: " + absShape3.getArea());
		System.out.println(absShape4.getDescription() + absShape4.getShapeName() + " area: " + absShape4.getArea());
	
		
		System.out.println();
		System.out.println("========the instanceof and downcasting========");
		//The instanceof keyword checks whether an object is an instance of a specific class
		//and compares the instance with type. The return value is true/false
		
		//if an objects is of a specified type (e.g. Circle, Triangle, Cube or Sphere in our case).
		if (absShape1 instanceof Circle) {
			Circle c = (Circle) absShape1; //downcasting absShape1 from AbsShape to Circle
			//we want to use specific method computePerimeter() and getPerimeter()
			//which are declared only in TwoDimensionalShape class and we can't access it directly without downcasting
			c.computePerimeter();
			System.out.println(c.getDescription() + c.getShapeName() + " perimeter: " + c.getPerimeter());
		}
		if (absShape2 instanceof Triangle) {
			Triangle  t = (Triangle) absShape2; //downcasting 
			t.computePerimeter();
			System.out.println(t.getDescription() + t.getShapeName() + " perimeter: " + t.getPerimeter());
		}
		if (absShape3 instanceof Cube) {
			Cube c = (Cube) absShape3; //downcasting 
			c.computeVolume();
			System.out.println(c.getDescription() + c.getShapeName() + " volume: " + c.getVolume());
		}
		if (absShape4 instanceof Sphere) {
			Sphere s = (Sphere) absShape4; //downcasting 
			s.computeVolume();
			System.out.println(s.getDescription() + s.getShapeName() + " volume: " + s.getVolume());
		}
		
		System.out.println();
		System.out.println("========Polymorphism, the instanceof and downcasting========");
		AbsShape shapes[];//declare 1D array of super class type AbsShape
		//the array can store an object from the inheritance class hierarchy of the AbsShape
		
		shapes = new AbsShape[4];//the array store 4 elements
		
		//create an object and store them in array
		shapes[0] = new Circle("one more circle in []", 19);
		shapes[1] = new Triangle("one more Triangle in []", 18, 17, 16);
		shapes[2] = new Cube("one more cube in []", 16);
		shapes[3] = new Sphere("one more sphere in []", 2.5);
		
		//processing
		//traverse the array and compute area of each geometric shape
		for(int i = 0; i < shapes.length; i++) {
			//retrieve the current geometric shape from the shapes[] located at index i
			AbsShape s = shapes[i];
			s.computeArea();
		}
		
		//output
		//traverse the array to display area of each geometric shape
		for(int i = 0; i < shapes.length; i++) {
			//retrieve the current geometric shape from the shapes[] located at index i
			AbsShape s = shapes[i];
			System.out.println(s.getDescription() + s.getShapeName() + " area: " + s.getArea());
		}
		
		System.out.println();
        System.out.println("==========instanceof and downcasting=======");
        // the instanceof keyword allows to check at runtime (i.e. during program execution)
        // if an objects is of a specified type (e.g. Circle, Triangle, Cube or Sphere in our case).
        // why is the instanceof keyword important? lets say,
        // AbsShape abstract superclass contains neither the computePerimeter() method nor the computeVolume() method. therefore,
        // we cannot directly invoke the methods on object stored in the shapes array of AbsShape type
        // remove the next comment to u will see that u cannot directly call the getPerimeter()
        // on the first element of the array (because it has been declared as AbsShape),
        // othwerwise we would get a compilation error.
        //System.out.println(shapes[0].getDescription() + ": " + shapes[0].getShapeName()  + ": perimeter: " + shapes[0].getPerimeter());
      
        // processing and output
        // traverse the array: in each iteration compute and display either the perimeter for the 2D geometric shapes or the volume for the 3D geometric shapes
        for (int i = 0; i < shapes.length; i++){
        	// retrieve the current geometrical shape from the shapes array located at index i
            AbsShape s = shapes[i]; 
            // determine the type of the object located at index i, so that we know whether we compute the perimeter or the volume for that object
            if (s instanceof Circle){
                Circle c = (Circle) s; // downcast the s from AbsShape to Circle.
                // Q1: Why do we need to downcast?
                // A1: Because we want to use specific methods (e.g. computePerimeter() and getPerimeter())
                // which are declared only in the 2DShape and its subclasses.
                // If we try to directly call the method on the s we would get a compilation
                // error because the variable s has been declared of type AbsShape above.
                // processing
                c.computePerimeter();
                // output
                // the getter methods are available on the object of type Circle because of the inheritance
                System.out.println(c.getDescription() + c.getShapeName()  + ": perimeter: " + c.getPerimeter());
            } else if (s instanceof Triangle){
                Triangle t= (Triangle) s; // downcast the s from AbsShape to Triangle.
                // processing
                t.computePerimeter();
                // output
                System.out.println(t.getDescription() + t.getShapeName()  + ": perimeter: " + t.getPerimeter());
            } else if (s instanceof Cube){
                Cube c = (Cube) s;
                // processing
                c.computeVolume();
                // output
                System.out.println(c.getDescription() + c.getShapeName()  + ": volume: " + c.getVolume());
            } else if (s instanceof Sphere){
                Sphere aSphere = (Sphere) s;
                // processing
                aSphere.computeVolume();
                // output
                System.out.println(aSphere.getDescription() + aSphere.getShapeName()  + ": volume: " + aSphere.getVolume());
            }
        }//end for loop
        
	}//end main

}//end class
