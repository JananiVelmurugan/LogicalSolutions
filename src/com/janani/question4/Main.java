/*Remove Duplicate Elements in an Array*/
package com.janani.question4;

import java.util.LinkedHashSet;

public class Main {

	static Integer[] removeDuplicates(Integer[] input) {

		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		for (Integer a : input) {
			set.add(a);
		}

		Integer[] output = set.toArray(new Integer[set.size()]);
		return output;

	}

	public static void main(String[] args) {

		Integer[] input = { 1, 4, 5, 8, 5, 2 };
		Integer[] output = removeDuplicates(input);
		for (Integer a : output) {
			System.out.println(a);
		}
	}
}
