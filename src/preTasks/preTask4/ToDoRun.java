package preTasks.preTask4;

import java.util.Scanner;
//program runner class
public class ToDoRun {

	//declare scanner
	public static Scanner scanner = new Scanner(System.in);
	
	//declare method to print out the description of the app
	public static void printOut() {
		System.out.println("Action [0-4]: \n"
							+ "1 - to add a new item toDoList \n" 
							+ "2 - to print out the toDoList \n"
							+ "3 - to update an existing toDoList \n"
							+ "4 - to remove an existing list of toDoList \n"
							+ "0 - exit \n\n"
							+ "After choosing any number/option press ENTER \n");
	}
	
	//declare main method to run the program
	public static void main(String[] args) {
		
		//access toDoList, declare an object
		ToDoList list = new ToDoList();
		printOut(); // call printOut method
		
		//store users input in the int param
		int param = scanner.nextInt();
		
		while(param!=0) {
			switch(param) {//to select one of many code blocks to be executed
			case 1: 
				System.out.println("Please enter a new task to add");
				scanner.nextLine();//just the Enter
				String task1 = scanner.nextLine();
				list.addToList(task1);//add task to the list
				
				System.out.println("Action [0-4]");//ask user to do another action
				param = scanner.nextInt();
				break;
			case 2: 
				System.out.println("Printing out the toDoList");
				list.printToDoList();
				
				System.out.println("Action [0-4]");//ask user to do another action
				param = scanner.nextInt();
				break;	
			case 3: 
				System.out.println("Please update by existing item by entering index");
				scanner.nextLine();//just the Enter
				int i = scanner.nextInt();//fist we gonna get index
				
				System.out.println("Please enter a new task to update/change by existing item");
				scanner.nextLine();//just the Enter
				String task3 = scanner.nextLine();
				list.changeTask(i, task3);//first it's gonna be index, then task
				
				System.out.println("Action [0-4]"); //to continue app user can choose another action
				param = scanner.nextInt();
				break;
			case 4: 
				System.out.println("Please enter a task as a String to remove it");
				scanner.nextLine();//just the Enter
				
				String task4 = scanner.nextLine();
				list.removeTask(task4);
				
				System.out.println("Action [0-4]");//we can still loop, continue with another action
				param = scanner.nextInt();
				break;
			default:
				param = 0;
				
			}//switch
		}//while end
		
		

	}

}
