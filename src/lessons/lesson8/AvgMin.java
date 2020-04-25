package lessons.lesson8;

public class AvgMin {
	//declare local variables/data members
	private int numbers[]; //numbers array
	private int min;//to store the minimum element of the array to be computed
	
	//generate an empty/default constructor
	public AvgMin() {

	}
	
	//declare set method to store an array of integer elements in the instance variable numbers
	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	//declare get method to retrieve the minimum element from the array
	public int getMin() {
		return min;
	}
	
	//calculate the minimum from all the numbers from the array
	public void calculateMin() {
		//initialized the min with the first element of the array
		min = numbers[0];
		
		//traverse the array [] from the second element since we stored the first one in the variable min
		for(int i = 1; i < numbers.length; i++) {
			//if the current element located in the [] numbers at index i is lower
			//than the value stored in the min then update the min with current element and so on
			if(numbers[i] < min) {
				min = numbers[i];//update i with the curret value
			}
		}
	}//end calculateMax method
	
	
}
