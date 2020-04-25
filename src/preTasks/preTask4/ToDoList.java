package preTasks.preTask4;
import java.util.*;

//instantiable class
public class ToDoList {

	//declare array list
	private List<String> toDoList = new ArrayList<>();

	//declare method to add in the list String
	public void addToList(String task) {
		toDoList.add(task);
	}
	
	//declare method to print todoList
	public void printToDoList() {
		//traverse the todoList using for loop
		for(int i = 0; i < toDoList.size(); i++) {
			System.out.println(i + " - " + toDoList.get(i));
		}
	}
	
	//declare method to edit/change task
	public void changeTask(int index, String task) {
		toDoList.set(index, task);
	}
	
	//declare method to remove task
	public void removeTask(String task) {
		toDoList.remove(task);	
	}

}//end class