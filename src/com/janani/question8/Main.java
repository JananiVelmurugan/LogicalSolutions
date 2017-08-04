/*factorial of a number*/
package com.janani.question8;

public class Main {
	static int fact(int num) {
		int fact = 1;
		if (num <= 0) {
			fact = 1;
		} else {
			for (int i = num; i >= 1; i--) {
				fact = fact * i;
			}
		}
		return fact;
	}

	public static void main(String[] args) {
		int fact = fact(5);
		System.out.println(fact);
	}
}
