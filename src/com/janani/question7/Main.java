package com.janani.question7;

public class Main {

	static void checkPrime(int input) {

		int count = 0;
		int number = 2;
		boolean isAlternate = true;

		while (count != input) {
			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				isAlternate = !isAlternate;
				if (isAlternate) {
					System.out.print(number + " ");
					count++;
				}
			}
			number++;
		}

	}

	public static void main(String[] args) {
		checkPrime(5);

	}

}
