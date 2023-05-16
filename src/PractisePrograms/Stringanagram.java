package PractisePrograms;

import java.util.Arrays;

public class Stringanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String abc="race";
String abc1="care";

char[] namearr=abc.toCharArray();
char[] namearr1=abc1.toCharArray();

Arrays.sort(namearr);
Arrays.sort(namearr1);
boolean result=Arrays.equals(namearr, namearr1);
if(result)
	System.out.println("String are anagrams");
	else
		System.out.println("Strings are not anagrams");
}
	

}
