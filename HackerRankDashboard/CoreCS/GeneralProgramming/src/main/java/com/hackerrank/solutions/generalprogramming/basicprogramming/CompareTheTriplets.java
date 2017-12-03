/**
 * 
 */
package com.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class CompareTheTriplets {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		int aScore = 0;
		int bScore = 0;

		if (a0 != b0) {
			int temp = a0 < b0 ? bScore++ : aScore++;
		}

		if (a1 != b1) {

			int temp = a1 < b1 ? bScore++ : aScore++;
		}
		if (a2 != b2) {

			int temp = a2 < b2 ? bScore++ : aScore++;
		}
		System.out.println(aScore + " " + bScore);

	}
}
