package lessons.lab5;
//two dimensional arrays
public class ArrayDemo {
	//declare data members / instance variables
	private int nums[][];//two dim array

	//declare default constructor 
	public ArrayDemo() {

	}
	
	//declare getter and setter
	public int[][] getNums() {
		return nums;
	}

	public void setNums(int[][] nums) {
		this.nums = nums;
	}
	
	public void setArrayNumber(int row, int column, int num) {
	nums[row][column] = num;//this is for scanner
	}
	
	
	
}//end class
