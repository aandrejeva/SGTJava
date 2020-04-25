package preTasks.preTask1;

public class Cat extends Animal {//Cat class-child class; Animal class-parent class
	//declare data members/variables
	private String type;//like a cat type
	
	//declare constructor with parameters
	public Cat(String name, String type) {
		super(name);// from Animal class constructor
		this.type = type;
	}
	
	//generate getter method to get name (it also inherits from Animal class, so here can comment this method)
	public String getName() {
		return super.getName(); //returns name from Animal class
	}
	
	//declare method
	public void speak() {
		super.speak();//call method from parent class
		System.out.println("I say Miaw...");//add additional out print specially for Cat class
	}
}
