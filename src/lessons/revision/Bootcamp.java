package lessons.revision;

public class Bootcamp { //app runner

	public static void main(String[] args) {
		
		Student s1 = new Student(); //made using default constructor 
		System.out.println(s1);
		
		Student s2 = new Student(); //made using default constructor ( and the student 2 has the same name as student 1)
		System.out.println(s2);
		
		Student s3;
		s3 = s1;
		
		//use setName method to give a name to the student
		s1.setName("Anna");
		
		//declare the variable to store the all student names
		String myName;
		myName = s1.getName();
		System.out.println("s1 name: " + myName);
		
		myName = s3.getName();
		System.out.println("s3 name: " + myName);
		
		myName = s2.getName();
		System.out.println("s2 name: " + myName);
		
		s2.setName("Olga");
		System.out.println(s2);
		
		myName = s2.getName();
		System.out.println("s2 name: " + myName);
		
		//we can tipe the name putting it inside the constructor which has parameters
		Student s4 = new Student("Alena");
		myName = s4.getName();
		System.out.println("s4 name: " + myName);



	}//end main
}//end class
