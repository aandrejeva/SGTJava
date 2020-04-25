package preTasks.preTask3;

public class MainApp implements MainInterface, HumanInterface {
	
	//declare variables
	private int age;
	
	//declare constructor
	public MainApp(int age) {
		this.age = age;
	}

	//implement all methods from HumanInterface (see below)
	@Override
	public void talk() {
		System.out.println("talk");
	}

	@Override
	public void walk() {
		System.out.println("walk");
	}

	@Override
	public int getAge() {
		return this.age;
	}

	//implement all methods from MainInterface (see below)
	@Override
	public void checkTest() {
		System.out.println("Check test");
	}

	@Override
	public String getString(String word) {
		return "New String";
	}
	
}//end class