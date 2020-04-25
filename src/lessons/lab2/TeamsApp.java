package lessons.lab2;

import java.util.Scanner;

/*
Problem 3
You have been asked to develop a java application
to allow to enter the number of Students can hit in the group. The application
should then calculate and display how many Students can be filled  in the Team and how
many Students have left over.
Your application should use instantiable classes to separate the calculations from the user input and output.
TeamsApp.java
   -- takes input from the user
   -- uses the Teams -- the instantiable class to perform the actual computations
*/
public class TeamsApp {

	public static void main(String[] args) {
		
	// declare local variables
	int numStu = 0;
	int tSize = 0;
		
	//declare a variable called input and create an object of type Scanner
	Scanner input = new Scanner(System.in);
		
    //declare a variable called myTeams to be able to work with an object of type Teams and create an object of type Teams
	Teams myTeams = new Teams(numStu, tSize);
	
	//input "Please enter the number of students: "
	System.out.println("Please enter the number of students: ");
	numStu = input.nextInt();
	// call/invoke the setter method to assign the value provided by the user
	myTeams.setNumberOfStudents(numStu);
	
    //input "Please enter the size of the groups: "
	System.out.println("Please enter the size of the groups: ");
	tSize = input.nextInt();
	// set/update the value of the object's instance variable called teamSize with the value provided from the keyboard
	myTeams.setTeamSize(tSize);

	//process
	// call/invoke compute methods of the object myTeams
	myTeams.computeNumOfTeams();
	myTeams.computeNumOfRemainigsStudents();
	
    //output of getNumOfTeams, getNumOfRemainigsStudents
	// call/invoke the getter methods to retrieve the number of teams and students left over
    // and store the value in the variables numTeams and rem
	int numTeams = myTeams.getNumOfTeams();
	int rem = myTeams.getNumOfRemainigsStudents();
	
	//output
	System.out.println("The number of teams of "+tSize+" from a group of "
	                + numStu+" will be "+numTeams+" teams with "+rem+" left over");
	
	}//end main

}//end class
