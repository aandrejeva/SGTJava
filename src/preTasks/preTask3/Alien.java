package preTasks.preTask3;

public class Alien implements HumanInterface, MainInterface {
	
	//declare variables
	private int age;

	//declare a constructor with parameter age
	public Alien(int age) {
		this.age = age;
	}

	//implement all methods from HumanInterface (see below)
	@Override
	public void talk() {
		System.out.println("I'm a little Alien, I can talk!");
	}

	@Override
	public void walk() {
		System.out.println("I'm a little Alien, I can walk!");
	}
	
	@Override
	public int getAge() {
		return this.age;
	}

	//implement all methods from MainInterface (see below)
	@Override
	public void checkTest() {
	}

	@Override
	public String getString(String word) {
		return null;
	}
	
}//end class
