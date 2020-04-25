package lessons.revision;
/*
Extra work on Characters, Strings and StringBuffers.
Write an application which reads in a sentence and then creates a new  word with all the spaces removed from the sentence. Use instantiable classes.
For example, if input is "I learn Java"
the output is:
"IlearnJava"
SpacesRemover -- the instantiable class: given a sentence, creates a new word by removing all the spaces from the sentence
*/
public class SpacesRemover {
	// declare data members / instance variables
	String sentence;
	String word;
	
    // declare a constructor without parameters
	// initialize the sentence with the empty string, otherwise the sentence instance variable is initialized with null
    // initialize the word with the empty string, otherwise the word instance variable is initialized with null
	public SpacesRemover() {
		this.sentence = "";
		this.word = "";
	}

	// declare setter methods and getter methods
	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
    // processing: given a sentence, creates a new word by removing all the spaces from the sentence
	
    // declare a variable named sb of type StringBuffer AND create an instance/object of StringBuffer to be able to build a new word
	//(remember: Strings are immutable -- i.e. cannot be modified)
	StringBuffer sb = new StringBuffer();
	
    // traverse the entire sentence in for loop
    // retrieve the current character at the index i
    // in each iteration check whether the current character is a space, if it isn't add the character to the buffer sb
	// save in the instance variable named word the String representation of the sb buffer
	public void compute() {
		for(int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if(c != ' ') {
				sb.append(c);
			}
		}
		word = sb.toString();
	}


}//end class
