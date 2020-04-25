package preTasks.preTask1;

public class Animal {//Animal class-parent class
	//declare data members/variables
	private String name;

	//declare constructor with parameter
	//this method is kind a setter, so we do not need to generate setter method
	public Animal(String name) {
		this.name = name;
	}

	//generate getter method to return the name
	public String getName() {
		return name;
	}

	public void speak() {
		System.out.println("My name is: " + name);
	}
	
}
