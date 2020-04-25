package preTasks.preTask2;

public class CarApp {//runner class

	public static void main(String[] args) {
	
	//Car car = new Car();	- it can't be created because Car class is an abstract class
	//and we can�t create an object based on our Abstract class
	
	//declare a variable named m5 of type BMW and create an object of type BMW	and also insert arguments in the constructor
	//public BMW(String model, short speed, float weight, String color, boolean isWorking, boolean isMPerformance ) 
	BMW m5 = new BMW("M5", (short) 300, 2500.23f, "Blue", true, true);//data type casting to assign short data type
	//BMW m3 = new BMW ("M3", (short) 0, 0, null, false, false);//data type casting to assign short data type
	m5.printAll();
	m5.startEngine();
	}//end main

}//end class
