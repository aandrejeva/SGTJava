package lessons.lab2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
Lab: Instantiable Classes
Problem 2
Route 66 is a highway in the USA with a length of 3,945 Km.  A cross country Bicycle race has been scheduled where people work in teams to cycle this highway non-stop from one end to the other.  The race has a rule that no one cyclist can cycle for more than 15 hours at a time.
You have been asked to develop an application that allows the user to enter the team's projected average speed in kilometres per hour and the number of members on the team.  The application should then calculate and display:
-- the time it will take the team to complete the journey,
-- the number of full 15 hour blocks to be cycled,
-- how many full blocks each team member will cycle,
-- how many hours would be leftover at the end.
Your application should be developed using instantiable classes.  All classes should be correctly commented and formatted.  Save your instantiable class as Route66.java
Route66App.java
-- takes input from the user
-- uses the Route66 -- the instantiable class to perform the different metrics computation
-- outputs the metrics calculated by an object of type Route66 -- i.e. the instantiable class
*/
public class Route66App{
	
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    
    public static void main(String args[]){
        
    	// declare local variables
        double speed;
        int memebersCount;
      
        // declare a variable called sc to be able to work with an object of type Scanner to allow input from the keyboard
        Scanner sc = new Scanner(System.in);
       
        // input
        //prompt the user to enter the required information and read the input from the user
        System.out.println("Enter the team's average speed in km/h: ");
        speed = sc.nextDouble();
        System.out.println("Enter the number of team members: ");
        memebersCount = sc.nextInt();
       
        //declare a variable called routeCalc and create an object of type Route66
        Route66 routeCalc = new Route66();
        
        //call/invoke the setter methods to assign the values provided by the user
        //to the routeCalc object's instance variables
        //set/update the value of the object's instance variable called speed with the value provided by the user via keyboard
        routeCalc.setSpeed(speed);
       
        //set/update the value of the object's instance variable called numMembers with the value provided by the user via keyboard
        routeCalc.setNumMembers(memebersCount);
      
        // processing
        routeCalc.calculateMetrics();
       
        // output
        // the problem does not ask to display the race details, but makes the application more user friendly
        System.out.println("_____________________________________________");
        System.out.println("RACE DETAILS: " + routeCalc.getRaceDeatails());
        System.out.println("_____________________________________________");
       
        // output the metrics calculated by routeCalc
        // retrieve each metric value using the corresponding getter method
        double value1  = routeCalc.getTime();
        System.out.println("Estimated time for the team to complete the journey: " + df2.format(value1) + " hr.");
       
        int value2 = routeCalc.getNumBlocks();
        System.out.println("The number of full 15 hr blocks to be cycled is: "+ value2);
      
        value2 = routeCalc.getNumBlocksPerMember();
        System.out.println("The number of full blocks each team member will cycle: "+ value2);
       
        value1 = routeCalc.getLeftOverTime();
        System.out.println("The number of hr left at the end: " + df2.format(value1) + " hr.");
        System.out.println("_____________________________________________");
        
    }//end main
}//end class
