package preTasks.preTask1;
//ShapeApp uses the instantiable classes Rectangle (a subclass) and the Shape (a superclass)
//to demonstrate the concepts of inheritance and polymorphism in Java.

public class ShapeApp {

	public static void main(String[] args) {
		System.out.println("::::::::::::inheritance::::::::::::");
		
		//declare a variable named shape and create an object of type Shape
		Shape shape = new Shape("Generic Shape");//pass the arguments inside the constructor
		
		//declare a variable named rectangle and create an object of type Rectangle
		Rectangle rectangle = new Rectangle("Generic Rectangle", 5, 8);//pass the arguments inside the constructor
		
		//processing (call methods)
		shape.computeArea();
		rectangle.computeArea();
		
		//output
		//we don't have the getArea method inside Rectangle class, but this method inherits from Shape class
		double area = rectangle.getArea();//inheritance
		System.out.println("rectangle area: " + area);
		System.out.println();
		
		System.out.println("::::::::::::polymorphism::::::::::::");
		//declare two variables of super-class type
		Shape s1, s2;
		
		//create new objects of type Shape
		s1 = new Shape("One more Generic Shape");
		s2 = new Rectangle("One more Generic Shape", 10, 20);
		
		//processing
		s1.computeArea();//calls the computeArea defined in the Shape class
		s2.computeArea();//calls the computeArea defined in the Rectangle class
		
		//output
		area = s1.getArea();
		System.out.println("the new area of Shape: " + area);//the value of shape is 0,in Shape class
		area = s2.getArea();//we don't have the getArea method inside Rectangle class, but this method inherits from Shape class
		System.out.println("the new area of Rectangle: " + area);
		
		System.out.println();
		
		System.out.println("::::::::::::overriding methods::::::::::::");
		s1.printDescription();
		s2.printDescription();
		
		System.out.println("::::::::::::instanceof::::::::::::");
		if(s2 instanceof Rectangle) {//the condition which is always true, if s2 is instance of Rectangle, we will proceed the code below
			//downcast s2 from type Shape to type Rectangle
			//we need to downcast to access the methods getWidth() getHeight() which are declared in Rectangle class
			//declare a different name r2 and inside r2 we want to use getWidth() and getHeight, that is why we need to downcast
			Rectangle r2 = (Rectangle) s2; //downcast: move Shape s2 object to the Rectangle object
			double width = r2.getWidth();
			double height = r2.getHeight();
			System.out.println("width and height: " + width + " " + height);
		}

	}//end main
}//end class
