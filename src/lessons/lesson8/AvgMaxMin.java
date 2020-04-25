package lessons.lesson8;
/* homework:
 * create one instantiable class to combine all methods from Avg, AvgMax, AvgMin classes
 */
public class AvgMaxMin {
	//declare instance variables/data members
	private int [] numbers; //declare an array of type int named numbers to store the numbers
	private double avg; 
	private int min;
	private int max;
	
	//declare set method to store an array of integer elements in the instance variable numbers
	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	//calculation of Average number
	public void averageCalc() {
		int sum; //to store the sum of all the elements
		sum = 0; 
		for(int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];// to update sum after each iteration of the loop
		}
	avg = (double)sum/numbers.length;//to calculate average number
	}

	//getter method to return average
	public double getAvg() {
		return avg;
	}
	
	//calculation of Minimum number
	public void minimumCalc() {
		min = numbers [0]; //initialized the min with the first element of the array
		for(int i = 1; i < numbers.length; i++) { //traverse the array [] from the second element since we stored the first one in the variable min
			if(numbers[i] < min) { //if the current element located in the [] numbers at index i is lower
				min = numbers[i]; //update min after each iteration of the loop
			}
		}
	}
	
	//declare get method to retrieve the minimum element from the array
	public double getMin() {
		return min;
		}
	
	//calculation of Maximum number
	public void maximumCalc() {
		max = numbers [0]; //initialized the max with the first element of the array
		for(int i = 1; i < numbers.length; i++) { //traverse the array [] from the second element since we stored the first one in the variable max
			if(numbers[i] > max) { //if the current element located in the [] numbers at index i is higher
				max = numbers[i]; //update max after each iteration of the loop
			} 
		}				
	}
	//declare get method to retrieve the maximum element from the array
	public double getMax() {
		return max;
	}
	
	
}//end class
