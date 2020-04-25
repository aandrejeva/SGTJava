package preTasks.preTask2;

public abstract class Car {
	//declare variables/data members
	private String model;
	private short speed;
	private float weight;
	private String color;
	private boolean isWorking;
	
	//declare an empty constructor
	public Car() {
		System.out.println("We just created the constructor");
	}
	//declare constructor with parameters
	public Car(String model, short speed, float weight, String color, boolean isWorking) {
		this.model = model;
		this.speed = speed;
		this.weight = weight;
		this.color = color;
		this.isWorking = isWorking;
	}
	
	//create a method to display all variables
	public void displayMe() {
		System.out.println("Car model is: " + this.model + " with the max speed " + this.speed + " weight " + this.weight + ". Car's color: "
				+ this.color + ". Auto parking is working: " + this.isWorking);
	}
	
	//declare an abstract method
	abstract void startEngine();
	
}//end class
