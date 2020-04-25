package lessons.revision;

public class Student {
	//declare a local variable
	private String name;
	
	//create(generate) a simple constructor (default constructor)
	public Student() {
		this.name = "Error: name did not set!"; //if we forgot to fill in the name the program will write the error message
	}
	
	//create the other constructor with parameter String
	public Student(String bootcampName) {
		this.name = bootcampName;
	}
	
	//create a get method
	public String getName() {
		return name;
	}
	
	//create a set method - this method gonna work for empty constructor
	public void setName(String name) {//this set is only for empty constructor
		this.name = name;
	}

	//Source-generate-toString()
	//this is similar to the get
	//it's overriding our constructor, just the name
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
}//end class
