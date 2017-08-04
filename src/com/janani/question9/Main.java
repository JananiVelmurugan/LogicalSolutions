/*Sum of the elements in an array*/
package com.janani.question9;

public class Main {
	public static int sumElements(int... array) {
		int sum = 0;
		for (int t : array) {
			sum += t;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		int sum = sumElements(array);
		System.out.println(sum);
	}

}
