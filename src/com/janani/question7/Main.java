/*prints n alternate prime number*/
package com.janani.question7;

public class Main {
	static int[] checkPrime(int range) {
		int[] output = new int[range];//
		int num = 2;// prime number starts with 2
		int index = 0;
		boolean isAlternate = true;
		while (index != range) {
			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				isAlternate = !isAlternate;
				if (isAlternate) {
					output[index] = num;// prime number is inserted in array
					index++;// increment index by 1
				}
			}
			num++;// to generate next number in series
		}
		return output;
	}

	public static void main(String[] args) {
		int[] output = checkPrime(5);
		for (int t : output) {
			System.out.print(t + " ");
		}
	}

}
