package lessons.revision;

import javax.swing.JOptionPane; //import swing graphical UI library

public class CDDiscountApp {

	public static void main(String[] args) {
	//declare local variables  
		int numOfCD, discountSum;
		
	//declare variable of type char
	char r;	
	
	do {
		//declare an object
		CDDiscount myCDDiscount = new CDDiscount();
		//input instead of Scanner we use JOptionPane methods
		numOfCD = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of CD: ")); //graphical pop up swing (graphical UI)
		
		myCDDiscount.setNumberOfCD(numOfCD);
		
		//process
		myCDDiscount.compute();
		
		//output
		discountSum = myCDDiscount.getDiscountAmount();
		
		//display a message
		JOptionPane.showMessageDialog(null, "Having purchased " + numOfCD + " CDs with discount " + discountSum + " %");
		
		r = JOptionPane.showInputDialog(null, "Do you want to continue shopping? (y/n)").charAt(0);// convert to char
		
	}
	while(r == 'y' || r == 'Y');// program continue running if answer is y
		

	}//end main

}//end class
