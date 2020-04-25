package lessons.revision;

public class Box {
//declare variables	
double width;
double height;
double length;

//create constructor w/o parameters
public Box(){
//	width = 10;
//	height = 10;
//	length = 5;
}

//create constructor with parameters
public Box(double width, double height, double length) {
	this.width = width;
	this.height = height;
	this.length = length;
}

public double compute() {
	return width * height * length;
}

}//end class
