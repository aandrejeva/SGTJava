package lessons.lesson8;
//the average of the elements from array and the max value of all the elements from the array
public class AvgMax {
	//declare instance variables
	private int numbers[]; //array to store the numbers
	private int max;//to store the maximum value of the number from array which gonna be computed
	
	//create default constructor
	public AvgMax() {
		//numbers[] = null
		//average = 0.0
		//max = 0
	}

	//declare setter method
	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	//processing method, compute max of all the numbers from []
	//our name of the class is AvgMax, so we need the method to compute the maximum of all the numbers from the array
	//methot to get the maximum
	public int computeMax() {
		max = numbers[0];
		for(int i = 1; i < numbers.length;i++ ) {
			//if the current element of array located at index i is higher than the value stored in max
			//we need to update the max the current element
			if(numbers[i]>max) {
				//update the max with current value 
				max = numbers[i];
			}
		}
		return max;
	}
	
	//getter method to retrieve the max
	public int getMax() {
		return max;
	}
	

}//end class
