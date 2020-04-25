package lessons.lesson8;

import java.util.Scanner;

/** 
Develop an application which creates multiple objects of type Person class
Store them in an array, retrieve the objects from the array and call different methods on these objects.
*/
public class PersonAppDemo {

	public static void main(String[] args) {
		//declare an array of type person
		Person people[];
		//to store the number of object Person to be created
		int n;
		
		//declare Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Person will be created? ");
		
		n = sc.nextInt();
		//create an array by default null
		people = new Person[n];
		
		//declare local variable to store the persons name, age, enjoysReading
		String name;
		int age;
		boolean enjoysReading;
		
		//create a for loop to take the users input, in each iteration create an object of type Person
		//using given input from Scanner and store it in array
		
		for (int i = 0; i < n; i++) {
			System.out.println("Person's name : ");
			name = sc.next();//we need to read input form keyboard and store it in the variable name
			System.out.println("Person's age : ");
			age = sc.nextInt();
			System.out.println("Does person enjoys reading? : ");
			enjoysReading = sc.nextBoolean();
			System.out.println("================================");
			//create an object of type Person using constructor which takes the basically 3 of information provided by the user
			people[i] = new Person(name, age, enjoysReading);	
		}//end for
		
		//processing
		//explain the information about each object Person from the array
		Person p;//declare variable of type Person
		boolean enjoy;//declare variable of type boolean to check is it true of false
		
		//traverse the array using loop 
		for(int i = 0; i < people.length; i++) {
			//retrieve the object Person located in the index i
			p = people[i];
			
			//call method displayMe
			p.displayMe();
			enjoy = p.getIsEnjoysReading();
			
			if(enjoy == true) {
				System.out.println("Enjoy reading. ");
			}else {
				System.out.println("Does not enjoys reading. ");	
			}
		}
			
		
	}//end main	

}//end class
