/**
 * 
 * Problem Statement-
 * [Manasa and Stones](https://www.hackerrank.com/challenges/manasa-and-stones/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class ManasaAndStones {
	static int[] stones(int n, int a, int b) {
		if (a == b) {
			int c[] = { a * (n - 1) };
			return c;
		}
		int output[] = new int[n];
		if (b < a) {
			int tmp = a;
			a = b;
			b = tmp;
		}

		output[0] = a * (n - 1);
		int diff = Math.abs(b - a);
		for (int i = 1; i < n; i++) {
			output[i] = diff + output[i - 1];
		}
		return output;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int a0 = 0; a0 < T; a0++) {
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			int[] result = stones(n, a, b);
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
			}
			System.out.println("");

		}
		in.close();
	}
}
