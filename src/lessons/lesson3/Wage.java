package lessons.lesson3;

import java.util.Scanner;

public class Wage {

	String name;
	double salary, rate, netSalary, allowance, taxDue, taxable;
	
	public double calcTaxable(double sal, double all){
        return sal - all;
    }
	
    public double calcTaxDue(double txble, double rt){
        return txble * rt;
    }
    
    public double calcNetSal(double sal,double txDue){
        return sal - txDue;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Wage myTax = new Wage();
		
		System.out.print("Please enter your name : ");
		myTax.name = sc.nextLine();
		
		System.out.print("\nHi "+ myTax.name+" can you please enter your salary : ");
		myTax.salary = sc.nextDouble();
		
		System.out.print("\nThank you " +myTax.name+ " can you now enter the tax rate ie .45 or .24 :");
		myTax.rate = sc.nextDouble();
		
		System.out.print("\nFinally " + myTax.name + " please enter your tax free allowance : ");
		myTax.allowance = sc.nextDouble();
		
		myTax.taxable = myTax.calcTaxable(myTax.salary, myTax.allowance);
		myTax.taxDue = myTax.calcTaxDue(myTax.taxable, myTax.rate);
		myTax.netSalary = myTax.calcNetSal(myTax.salary, myTax.taxDue);
		
		System.out.println("\n\tHere's the bad news " + myTax.name + "\n"+
	            "\tGross Salary = \t" + myTax.salary + "\n" +
	            "\tAllowance = \t" + myTax.allowance + "\n" +
	            "\t\t\t________\n"+
	            "\tTaxable = \t" + myTax.taxable + "\n" +
	            "\tRate = \t\t" + (myTax.rate*100) + "%\n" +
	            "\tTax due = \t" + myTax.taxDue + "\n" +
	            "\tNet Salary = \t" + myTax.netSalary + "\n");
	}
}
