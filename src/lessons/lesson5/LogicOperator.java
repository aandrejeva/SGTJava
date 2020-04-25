package lessons.lesson5;

import java.util.Scanner;

public class LogicOperator {

	public static void main(String[] args) {
		
		int num = 90;
		switch (num) {
		case 10:
			System.out.println("Variable is 10");
			break;
		case 20:
			System.out.println("Variable is 20");
			break;
		case 80:
			System.out.println("Variable is 80");
			break;
		case 90:
			System.out.println("Variable is 90");
			break;
			default:
				System.out.println("Variable is something else?!");
		}
		
		
		// == equal to    x==y
		// != not equal   x!=y
		// > greater than x>y
		// < less than x<y
		// >= greater than or equal x>=y
		// <= less than or equal x<=y
		//&& logical and return true if both statements are true  x<5 && x<10
		// || logical or return true if one of the statement is true x<5 || x<10
		// ! logical not reverse the result, return false if the result is true !(x<5 && x<10)
		
		boolean isEven = true;
		if(isEven) {
			System.out.println("boolean is" + isEven);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age:");
		int age  = sc.nextInt();
		
		if(age < 18) {
			if (age >=10 && age <= 15) {
			System.out.println("It's a teen's age!");
		}else if (age >= 16 && age <= 18) {
			System.out.println("It's a grown teenager's age!");
		}else {
			System.out.println("It's a child's age!");
			}
		}
		
		else if (age == 20 || (age > 21 && age < 99)) {
			System.out.println("It's a grown up's age!");
		}
		
		else {
			if (age >= 101) {
				System.out.println("No one lives too long!");
			}else {
			System.out.println("Update your logic!");
			}
		
		}

	}//  end main

}// end class
