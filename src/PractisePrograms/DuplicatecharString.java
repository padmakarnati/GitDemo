package PractisePrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatecharString {

	public static void main(String[] args) {
		printDuplicatChar("Programming");
		printDuplicatChar("JavaLanguage");
	}

	public static void printDuplicatChar(String word) {
		char[] Characters = word.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : Characters) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else
				charMap.put(ch, 1);

		}
		Set<Map.Entry<Character, Integer>> Entryset = charMap.entrySet();
		System.out.println("Duplicate characters in a given string" + word);
		for (Map.Entry<Character, Integer> entry : Entryset) {
			if (entry.getValue() > 1)
				System.out.printf("%s :%d %n", entry.getKey(), entry.getValue());
		}

	}

}