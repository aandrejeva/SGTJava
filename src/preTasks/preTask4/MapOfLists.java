package preTasks.preTask4;

import java.util.*;

public class MapOfLists {

	public static void main(String[] args) {
		
		Map<String, List> mapOfLists = new HashMap<String, List>();
		
		ArrayList<String> listOfStrings = new ArrayList<String>();
		listOfStrings.add("Java");
		listOfStrings.add("Swift");
		listOfStrings.add("Ruby");
		listOfStrings.add("Python");
		listOfStrings.add("C++");
		System.out.println("Programming Language: " + listOfStrings);
		
		ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();
		listOfIntegers.add(1);
		listOfIntegers.add(11);
		listOfIntegers.add(13);
		listOfIntegers.add(3);
		listOfIntegers.add(4);
		System.out.println("TIOBE Index for April 2020:" + listOfIntegers);
		
		mapOfLists.put("strings", listOfStrings);
		mapOfLists.put("integers", listOfIntegers);
		
		mapOfLists.get("strings").add("C");
		mapOfLists.get("integers").add(new Integer(2));
		
		System.out.println(mapOfLists);
		
		mapOfLists.get("strings").remove("Ruby");//remove by specified String value
		mapOfLists.get("integers").remove(2);//remove by index
		
		System.out.println(mapOfLists);
	
	}//end main

}//end class
