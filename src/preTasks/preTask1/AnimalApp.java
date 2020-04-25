package preTasks.preTask1;

public class AnimalApp {

	public static void main(String[] args) {
		//declare two objects
		Animal a = new Animal("Fido");//with one parameter in constructor as Animal(parent)class has
		Cat c = new Cat("Felix", "Persian");//with two parameters in constructor as Cat(child)class has
		
		//out print
		System.out.println("The animal is called " + a.getName());//return the name
		System.out.println("The cat is called " + c.getName());//return the name
		a.speak(); //call speak method
		c.speak(); //call speak method
	}

}
