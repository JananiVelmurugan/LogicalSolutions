package com.janani.question5;

public class Main {

	static boolean checkPrime(int number) {

		boolean isPrime = true;

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

	public static void main(String[] args) {
		boolean isPrime = checkPrime(9);
		System.out.println(isPrime);
	}

}
