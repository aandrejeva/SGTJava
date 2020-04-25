package lessons.lesson7;
/**
A palindrome is a string that reads the same forwards and backwards. For
example, noon and madam are spelled the same forward and backward.
Develop an application which reads in a string and determines whether it is
a palindrome. If the input string is a palindrome, your application should
display the message:
The string is a palindrome.
Otherwise, it should print out the message:
The string is not a palindrome.
The application should make use of instantiable classes.
*/
public class Palindrome {

	//declare instance variables/data members
	private String text; //initial text
	private String palindromeMessage;//to provide message is the word polindrome of not
	
	//declare constructor w/o parameters
	public Palindrome() {
		text = "";//default value empty string
		palindromeMessage = "";//default value empty string
	}
	
	//declare setter method
	public void setText(String text) {
		this.text = text;	
	}
	
	//declare getter method to return string palindromeMessage
	public String getpalindromeMessage() {
		return palindromeMessage;
	}
	
	//compute method to decide is the string palindrome
	public void decideIsPalindrome() {
		
//		StringBuffer sb = new StringBuffer();//create an object of type StringBuffer
//		
//		int len = text.length(); // the number of characters in the string text (length)
//		
//		//traverse the text from the end to the beginning (reverse)
//		for (int i = len - 1; i>=0; i--) {
//			//retrieve one char in each iteration of the loop
//			char c = text.charAt(i);
//			//add each char to the StringBuffer
//			sb.append(c);
//		}
//		//convert back from StringBuffer to string (from a mutable representation back to immutable using .toString() method)
//		String reversedText = sb.toString();
		
		if(text.equalsIgnoreCase(reversedText())) {
			palindromeMessage = "The text " + text + " is a PALINDROME";
		}else {
			palindromeMessage = "The text " + text + " is not a PALINDROME :( ";
		}
		
	}//end decideIsPalindrome method
	
	//declare compute method to reverse text
	public String reversedText() {
		StringBuffer sb = new StringBuffer();//create an object of type StringBuffer
		
		int len = text.length(); // the number of characters in the string text (length)
		
		//traverse the text from the end to the beginning (reverse)
		for (int i = len - 1; i>=0; i--) {
			//retrieve one char in each iteration of the loop
			char c = text.charAt(i);
			//add each char to the StringBuffer
			sb.append(c);
		}
		//convert back from StringBuffer to string (from a mutable representation back to immutable using .toString() method)
		String reversedText = sb.toString();
		return reversedText;
	}
	
	
}//end class
