package preTasks.preTask4;

import java.util.*;

public class ListApp {

	public static void main(String[] args) {
		//create array list
		ArrayList arrayList = new ArrayList();
		//to add something in the array list we need to specify the method add()
		arrayList.add("Java");
		arrayList.add("Swift");
		arrayList.add("JS");
		
		//add duplicate to check two of them or only one will be removed. see below
		arrayList.add("JS");
		
		//when we are printing out everything it's overriding to the String
		//in this arrayList everything will be in the String
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		
		//remove the last one
		//arrayList.remove(1);//removes by index 1 (it will be "Swift")
		//System.out.println(arrayList);
		
		arrayList.remove("Java");//specify what exactly we want to remove
		System.out.println(arrayList);
		arrayList.remove("JS");//remove JS to check one or both of duplicates will be removed
		System.out.println(arrayList);//only one of them is removed
		
		//if arrayList contains print the message
		if (arrayList.contains("JS")) {
			System.out.println("JS is here");
		}
		
		//It uses a doubly linked list internally to store the elements.
		//It can store the duplicate elements. It maintains the insertion order.
		System.out.println("=============");
		LinkedList<String> name = new LinkedList<String>();  
		name.add("Tom");  
		name.add("Sam");  
		name.add("Mike");  
		name.add("Mike");//duplicates will be displayed
		
		//remove Mike to check one or both of duplicates will be removed
		name.remove("Mike"); //only one will be removed, below is printout
		
		Iterator<String> itr = name.iterator(); //Iterators are used to retrieve elements one by one.
		while(itr.hasNext()) {  
		System.out.println(itr.next());  
		}
		System.out.println("=============");
		
		//LinkedHashSet maintains a linked list of the entries in the set, in the order in which they were inserted.
		//That is, when cycling through a LinkedHashSet using an iterator,
		//the elements will be returned in the order in which they were inserted
	      LinkedHashSet hs = new LinkedHashSet();
	       // add elements to the hash set
	      hs.add("B");
	      hs.add("A");
	      hs.add("D");
	      hs.add("E");
	      hs.add("C");
	      hs.add("F");
	      hs.add("F");//it should not print two F, it will print only one F
	      System.out.println(hs);
	   }
	//output B, A, D, E, C, F

	}//end main

//end class
