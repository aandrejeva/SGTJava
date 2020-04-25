package lessons.revision;

public class Exchange {

	//declare private data members (amount, rate, conversion)
	private double amount;
	private double rate;
	private double conversion;
	
	//create an empty constructor (print error if forgot to add something)
	public Exchange() {
		System.out.println("ERROR: you forgot to add the data!");
	}
	
	//create a constructor with the parameters (amount, rate)
	public Exchange(double amount, double rate) {
		this.amount = amount;
		this.rate = rate;
	}
	
	//generate set methods for amount and rate
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	//compute method (calculation) the result put in the local variable named conversion
	public void computeConversion() {
		conversion = rate * amount;
	}
	
	//to return conversion result generate get method
	public double getConversionResult() {
		return conversion;
	}

}//end class

