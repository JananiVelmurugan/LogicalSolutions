/*Find LCM(Least Common Multiple) of two numbers*/
package com.janani.question1;

public class Main {

	static int lcm(int input1, int input2) {

		int max = Math.max(input1, input2);
		int min = Math.min(input1, input2);

		int mul;
		int lcm = 1;

		for (int i = 1; i <= min; i++) {

			mul = i * max;
			if (mul % min == 0) {
				lcm = mul;
				break;
			}
		}

		return lcm;

	}

	public static void main(String[] args) {

		int lcm = lcm(15, 20);
		System.out.println(lcm);
	}
}
