package preTasks.preTask1;
//Rectangle class inherits all the non-private data members and methods of the Shape class

public class Rectangle extends Shape { //inherits/child class
	//declare instance variables/data members for class Rectangle
	private double width;
	private double height;
	
	//declare constructor with 3 parameters (String name from parent class Shape, other from this class)
	public Rectangle(String name, double width, double height) {
		super(name);//super() calls the constructor of the super class Shape which takes an argument of string
		this.height = height;
		this.width = width;
	}

	//the overriding method has the same name and returned data type as in parent class
	//it returns same data type, number of parameters and parameters data type as overridden method from parent class
	@Override 	//(that is how we can access it) we override it from super/parent class
	public void computeArea() {
		//the method specializes the area computation with the rectsngle's area computation
		area = width * height; //in parent class the area value is 0, that is the reason why we override
	}

	@Override
	public void printDescription() {
		System.out.println("a rectangle: ");
		String name  = getShapeName();//calling from Shape class, because it inherits from Shape class,
									  //we didn't create it in this class
		System.out.println(name);
	}
	
	@Override //the overriding method, reuses the implementation from the super-class Shape
	public void displayMe() {
		super.displayMe();
		//by calling the method with the same name displayMe() from the Shape class
		//the Java providing the super keyword to show that it is from the different class
		//the super keyword shows to call the method displayMe() from super-class
		System.out.println("width : " + width);
		System.out.println("height : " + height);
	}

	//declare method getWidth specially for this class to retrieve value of width
	public double getWidth() {
		return width;
	}
	
	//declare method getHeight specially for this class to retrieve value of height
	public double getHeight() {
		return height;
	}
	
	
}//end class
