package preTasks.preTask3;

public class Person implements HumanInterface {
	//declare variables
	private int age;
	
	//declare a constructor with parameter age
	public Person(int age) {
		this.age = age;
	}

	//implement all methods from HumanInterface
	@Override
	public void talk() {
		System.out.println("Hello, I can talk!");
	}

	@Override
	public void walk() {
		System.out.println("Hello, I can walk!");
	}

	@Override
	public int getAge() {
		return this.age;
	}

}
