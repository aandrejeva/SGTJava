package preTasks.preTask4;

import java.util.*;

public class ListOfMixedTypes {

	public static void main(String[] args) {
		List<List> listOfMixedTypes = new ArrayList<List>();
		
		//create array list of each datay type
		ArrayList<String> listOfStrings = new ArrayList<String>();
		ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();
		
		//add the String data type
		listOfMixedTypes.add(listOfStrings);
		listOfStrings.add("Java");
		listOfStrings.add("Swift");
		listOfStrings.add("Ruby");
		listOfStrings.add("Python");
		listOfStrings.add("C++");
		System.out.println("Programming Language: " + listOfStrings);
		
		listOfStrings.remove("C++");//remove specifying the String value "C++"
		System.out.println(listOfStrings);//print out the result after removing
		
		listOfStrings.remove(1);//remove by index 1
		System.out.println(listOfStrings);//print out the result after removing
		
		System.out.println();
		
		//add the int data type
		listOfMixedTypes.add(listOfIntegers);
		listOfIntegers.add(1);
		listOfIntegers.add(11);
		listOfIntegers.add(13);
		listOfIntegers.add(3);
		listOfIntegers.add(4);
		System.out.println("TIOBE Index for April 2020:" + listOfIntegers);
		
//		listOfIntegers.remove(11)//remove the value: 11 - impossible, can be removed only by passing index of the int
//		System.out.println(listOfIntegers);//print out the result after removing
		
		listOfIntegers.remove(1);//remove by index 2
		System.out.println(listOfIntegers);//print out the result after removing
		
	}//end main

}//end class
