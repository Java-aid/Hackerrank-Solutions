/**
 * 
 * Problem Statement-
 * [Recursion: Davis' Staircase](https://www.hackerrank.com/challenges/ctci-recursive-staircase/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.tutorials.ctci;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class DavisStaircase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();

		for (int a0 = 0; a0 < s; a0++) {
			int n = in.nextInt();
			if (n < 2) {
				System.out.println(n);
			} else {
				int a[] = new int[n + 1];
				a[1] = 1;
				a[2] = 2;
				a[3] = 4;
				for (int i = 4; i < n; i++) {
					a[i] = a[i - 1] + a[i - 2] + a[i - 3];
				}
				System.out.println(printNoOfStaircases(n, a));
			}
		}
		in.close();
	}

	/**
	 * @param n
	 * @return
	 */
	private static int printNoOfStaircases(int n, int a[]) {
		if (n <= 2)
			return a[n];
		if (n == 3)
			return a[n];

		return a[n] = a[n - 1] + a[n - 2] + a[n - 3];
	}
}
