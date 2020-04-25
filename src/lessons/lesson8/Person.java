package lessons.lesson8;
/** 
Person.java demonstrates
	-- how to declare an instantiable class
	-- how to declare multiple constructors
	-- constructor: during a program's execution, a constructor is used to initialize the object's instance variables when that object is created
	-- how to implement a class's attributes by declaring instance variables
	-- how to implement a class's behaviour by implementing a method (i.e. displayMe())
*/
public class Person {

	//declare instance variables
	private String name;
	private int age;
	private boolean enjoysReading; //to store enjoy reads or not (by default false)
	
	//generate the default constructor
	public Person() {
	}
	
	//generate constructor with one parameter
	public Person(String name) {
		this.name = name;
	}
	
	//generate constructor with two parameter
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//generate constructor with three parameter
	public Person(String name, int age, boolean enjoysReading) {
		this.name = name;
		this.age = age;
		this.enjoysReading = enjoysReading;
	}
	
	//generate constructor with three parameter with different signature
	public Person(boolean enjoysReading, String name, int age) {
		this.name = name;
		this.age = age;
		this.enjoysReading = enjoysReading;
	}	
		
	//display the content of instance variables
	public void displayMe() {
		System.out.println("Person's name " + name);
		System.out.println("Person's age " + age);
		System.out.println("Person's enjoys to reading " + enjoysReading);
		System.out.println("");
	}
	//setter
	public void setAge(int age) {
		this.age = age;
	}
	//getter
	public boolean getIsEnjoysReading() {
		return enjoysReading;
	}
	
}//end class



