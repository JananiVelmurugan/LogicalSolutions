/*Sum of an array elements without each element*/
package com.janani.question10;

public class Main {
	static int[] sumArrayElements(int... array) {
		int[] arraySum = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = 0; j < array.length; j++) {
				if (i != j) {
					sum += array[j];
				}
			}
			arraySum[i] = sum;
		}
		return arraySum;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4 };
		int[] sum = sumArrayElements(array);
		for (int i : sum) {
			System.out.print(i + " ");
		}
	}
}
