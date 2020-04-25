package lessons.lab2;
/*
Problem 3
You have been asked to develop a java application
to allow to enter the number of Students can hit in the group. The application
should then calculate and display how many Students can be filled in the Team and how
many Students have left over.
Your application should use instantiable classes to separate the calculations from the user input and output.
Teams.java
    -- takes input from the user
    -- uses the Teams -- the instantiable class to perform the actual computations
hint is in the TeamsApp.java System.out.println
*/
public class Teams {
	
    //declare data members
	private int numberOfStudents;
	private int teamSize;
	private int numOfTeams;
	private int numOfRemainigsStudents;
	
    //declare constructor
	//constructor taking in two parameters numberOfStudents, teamSize
	public Teams(int numberOfStudents, int teamSize) {
		this.numberOfStudents = numberOfStudents;
		this.teamSize = teamSize;
	}

	//setters for setNumberOfStudents and setTeamSize
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

    //compute method to calculate number of teams
	public void computeNumOfTeams() {
		numOfTeams = numberOfStudents/teamSize;
	}
	
	//compute method to calculate how many students have left over
	public void computeNumOfRemainigsStudents() {
		numOfRemainigsStudents = numberOfStudents - (numOfTeams * teamSize);
	}

	//getters for getNumOfTeams and getNumOfRemainigsStudents
	public int getNumOfTeams() {
		return numOfTeams;
	}

	public int getNumOfRemainigsStudents() {
		return numOfRemainigsStudents;
	}
	
}//end class
