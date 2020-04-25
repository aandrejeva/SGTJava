package lessons.revision;

import java.util.Scanner;

/*
Extra work on Characters, Strings and StringBuffers.
Write an application which reads in a sentence and then creates a new  word with all the spaces removed from the sentence. Use instantiable classes.
For example, if input is "I learn Java"
the output is:
"IlearnJava"
SpacesRemoverApp is an application which does the following tasks
-- prompts the user to input a sentence
-- uses the instantiable class SpacesRemover to create a word by removing all the spaces from the sentence
-- retrieves the word and displays it
*/
public class SpacesRemoverApp {

	public static void main(String[] args) {
		// declare local variables
		String sentence;
		String word;
		
        // input
		//declare a variable named scanner and create and object of type Scanner
		Scanner scanner = new Scanner(System.in);
		
		// input: prompt the user to provide a sentence
		System.out.println("Please enter a sentence: ");
		sentence = scanner.nextLine();
		
		//declare a variable named spacesRemover and create and object of type SpacesRemover
		SpacesRemover spacesRemover = new SpacesRemover();
        // use the setter method to set the remover object's instance variable called sentence to the sentence provided by the user
		spacesRemover.setSentence(sentence);
		
        // processing: remove the spaces from the sentence
		spacesRemover.compute();
		
        // output the word created from the sentence:
        // first, retrieve the word using the getter getWord() on the object remover
		word = spacesRemover.getWord();
        // second, display the word
		// Alternatively, we could write the above 2 statements in one line
        //System.out.println("the word is: " + spacesRemover.getWord());
        System.out.println("the word is: " + word);
       
	}//end main

}//end class
