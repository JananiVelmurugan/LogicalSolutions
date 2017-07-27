package com.janani.question2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	static int countVowel(String input) {

		char[] ch = input.toCharArray();
		int count = 0;
		Set<Character> set = new HashSet<>();
		for (char c : ch) {
			set.add(c);
		}
		System.out.println(set);
		for (char c : set) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				//count++;
			}
		}
		List<Character> vowelsList = Arrays.asList(new Character[] {'a','e','i','o','u'});
	
		for (char c : input.toCharArray()) {
			if ( vowelsList.contains(Character.toLowerCase(c))) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int count = countVowel("Onion");
		System.out.println(count);
	}

}
