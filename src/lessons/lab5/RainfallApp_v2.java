package lessons.lab5;

//runner App class for RainfallAvgMaxMin_2.java

public class RainfallApp_v2 {

	public static void main(String[] args) {
		
		//declare a variable named rainfallAvgMaxMin and create an object of type RainfallAvgMaxMin
		RainfallAvgMaxMin_v2 rainfallAvgMaxMin2 = new RainfallAvgMaxMin_v2();
		
		//call method to ask the user to input data through scanner
		rainfallAvgMaxMin2.askUserToInputData();
		
		//call displayProvidedDataInTable method to out print data in the table form
		rainfallAvgMaxMin2.displayProvidedDataInTable();
	
		//call calculation methods
		rainfallAvgMaxMin2.calcAverage();
		rainfallAvgMaxMin2.calcMaximum();
		rainfallAvgMaxMin2.calcMinimum();
		
	}//end main
}//end class
