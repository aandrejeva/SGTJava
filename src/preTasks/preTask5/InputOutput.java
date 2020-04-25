package preTasks.preTask5;

import java.io.*;
import java.util.*;

//example how to create, write and read the file
public class InputOutput {

	public static void main(String[] args) {
		
		//create new txt format file
		File file = new File("file.txt");//specify the file's name (pathname)
		
		//check if file does not exist
		if(!file.exists()) {
			try {//make in a save way
			//we need to create new file
			file.createNewFile();
			} catch(IOException e) {//here is unexpected exception, helps to understand what we did wrong
				e.printStackTrace();
			}
		}
		
		String text = readFile();
		try { //make in a save way
			PrintWriter pw = new PrintWriter(file);//we gonna use our file
			//use Scanner
			Scanner in = new Scanner(System.in);
			//ask for the user's input
			System.out.println("Please type here: ");
			String userInput = in.nextLine();
			
			text += userInput;//update text entered by the user
			pw.println("file.txt: " + text);//print out our text file
			pw.close();//we need to close file
			
		} catch (FileNotFoundException e) {//if we can't find the file
			e.printStackTrace();
		}
	}//end main
	
		//declare read file method, we gonna use the BufferedReader
		public static String readFile() {
			String result = ""; //declare as a empty one for the BufferedReader, we can keep it with null value
			BufferedReader br = null;//assign value null, default value of nothing
			try {
				br = new BufferedReader(new FileReader("file.txt"));
				String line;
				//everything that is inside our BufferedReader, we gonna read all those lines
				while((line = br.readLine()) != null) {//not null, everything that file might have
					result += line + "\n";//put everything inside the result, all we add will be on the next line \n
				}
				br.close();	//close BufferedReader, otherwise it's gonna buffer all the time and remains open
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}	
			return result;
		}
		
}//end class
