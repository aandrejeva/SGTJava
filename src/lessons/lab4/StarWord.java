package lessons.lab4;

public class StarWord {
	//declare data members/local variables
	private String word;
	private StringBuffer sb; //StringBuffer
	
	//constructor
	public StarWord() {
		this.sb = new StringBuffer();
	}
	
	//setMethod
	public void setWord(String w) {
		this.word = w;
	}
	
	//compute methods (more than one)
	//computeVowels - a, e, i, o, u,
	public void computeVowels() {
		int index = 0;
		while(index < word.length()) {
			char c = word.charAt(index);
			if(c == 'a' || c == 'e' ||  c == 'i' || c == 'o' || c == 'u') {
				sb.append(c);
			}
			index++;
		}
	}//end computeVowels
	
	//computeStars
	public void computeStars() {
		int length = word.length();
		for(int i = 0; i < length; i++) {
			sb.append('*');
		}	
	}//end computeStars
	
	//computePigLatin
	public void computePigLatin() {
		char firstLetter = word.charAt(0);
		for(int i = 1; i < word.length(); i++) {
			char letter = word.charAt(i);
			sb.append(letter);
		}
		sb.append(firstLetter);
		sb.append("ay");
		
	}//end computePigLatin
	
	//reverseWord
	public void reverseWord() {
		for(int i = word.length() - 1; i >= 0; i--) {
			char letter = word.charAt(i);
			sb.append(letter);
		}
	}//end reverseWord
	
	//get method
	//inside the getter method we can make .toString()
	public String getStringBuffer() {
		return sb.toString();
	}

}//end class

