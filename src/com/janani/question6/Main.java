/*Prints first n prime numbers*/
package com.janani.question6;

public class Main {
	static int[] printPrime(int range) {
		int[] output = new int[range];//
		int num = 2;// prime number starts with 2
		int index = 0;
		while (index != range) {// loop till the index=range
			boolean isPrime = true;// by default set any number as prime
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {// check if a number is exactly divisible
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				output[index] = num;// prime number is inserted in array
				index++;// increment index by 1
			}
			num++;// to generate next number
		}
		return output;
	}

	public static void main(String[] args) {
		int[] output = printPrime(3);
		for (int i : output) {
			System.out.print(i + " ");
		}
	}

}
