package lessons.lesson8;
//to calculate average in this class
public class Avg {
	//declare instance variables
		private int numbers[]; //array to store the numbers
		private double average;//to store the average value of number from the array which gonna be to be computed
		
		//declare an empty constructor
		public Avg() {
			
		}
		//declare setter method
		public void setNumbers(int[] num) {
			numbers = num;
		}
		
	//processing method (compute the average of all the numbers from []
	public void calculateAverage() {
		int sum;//to store the sum of all the elements
		int currentElement;// to store the current element from the array
		
		sum = 0;
		
		for(int i = 0; i < numbers.length;i++) {
			//retrieve the element at index i 
			//currentElement = numbers[i];
			//update the sum
			sum = sum + numbers[i];	
		}
		
		//compute the average
		average = (double)sum/numbers.length;	
	}

	//getter for average
	public double getAverage() {
		return average;
	}
}//end class
