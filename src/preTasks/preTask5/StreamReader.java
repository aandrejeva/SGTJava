package preTasks.preTask5;

import java.io.*;

//example to use InputStreamReader
//advanced way to provide input from keyboard is InputStreamReader
public class StreamReader {

	public static void main(String[] args) throws IOException {
		
		String text = "";//for the save way provide that it is empty
		System.out.println("Please enter the text: ");
	
		InputStreamReader input  = new InputStreamReader(System.in);
		
		//using BufferedReader we can read what we put inside the InputStreamReader
		//BufferedReader and InputStreamReader always are used together
		BufferedReader br = new BufferedReader(input);
		
		//put everything in the variable text of type Sting
		text = br.readLine(); // this read our string
		System.out.println(text);//print out

	}//end main

}//end class
