package lessons.revision;
// if you buy more CD you will get a higher discount
public class CDDiscount {
	//declare private variables
	private int numberOfCD;
	private int discountAmount;
	
	//generate an empty constructor
	public CDDiscount() {
		
	}

	//generate a setter method for number of CDs
	public void setNumberOfCD(int numberOfCD) {
		this.numberOfCD = numberOfCD;
	}
	
	//compute
	public void compute() {
		if(numberOfCD > 40) {
			discountAmount = 50;
		}else if(numberOfCD > 20) {
			discountAmount = 30;
		}else if(numberOfCD > 10) {
			discountAmount = 20;
		}else {
			discountAmount = 0;
		}
	}//end compute method
	
	//generate a getter method for discount amount
	public int getDiscountAmount() {
		return discountAmount;
	}
	
}//end class

