package preTasks.preTask2;

public class BMW extends Car{//inherits from the abstract class Car
private boolean isMPerformance = false;

	//if we extend the abstract class we need to put the abstract method mandatory
	//but we override it to put what we need exactly for the BMW class
	@Override
	void startEngine() {
		System.out.println("You can start engine with mobile app.");	
	}
	
	//method to put inside constructor from super class and new variable isMPerformance
	public BMW(String model, short speed, float weight, String color, boolean isWorking, boolean isMPerformance) {
		super(model, speed, weight, color, isWorking);
		this.isMPerformance = isMPerformance;
	}
	
	//declare method that will be only for BMW class
	public void printAll() {
		super.displayMe();//provide keyword super what means that the method is from the super class
		System.out.println("Car is with M Performance" + isMPerformance);
	}

}//end class
