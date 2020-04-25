package preTasks.preTask3;

public class HumanApp {

	public static void main(String[] args) {
		//we can access HumanInterface through Person and Alien
		Person bob = new Person(23);//(age)
		System.out.println(bob.getAge());//output age
		bob.talk();
		bob.walk();
		
		Alien al = new Alien(3232);//(age)
		System.out.println(al.getAge());//output age
		al.talk();
		al.walk();
		
		MainApp mainApp = new MainApp(1);
		System.out.println(mainApp.getAge() + mainApp.getString(null));
		mainApp.talk();
		mainApp.walk();
		mainApp.checkTest();
		
	}
}
