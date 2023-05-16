package PractisePrograms;

public class ReverseEachWord {

	public static void main(String[] args) {
		reverseEachwordofString("Java concept of the day");
		reverseEachwordofString("Reverse Me");
	}
	
	public static void reverseEachwordofString(String inputstring) {
		String[] words=inputstring.split(" ");
		String reversestring="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String reverseword="";
			for(int j=word.length()-1;j>=0;j--) {
				reverseword=reverseword+word.charAt(j);
				
			}
			reversestring=reversestring+reverseword+" ";
			
		}
		System.out.println(inputstring);
		System.out.println(reversestring);
		
		 
	}

}
