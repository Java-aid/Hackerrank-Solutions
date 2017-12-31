/**
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class DrawingBook {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		int result = 0;

		if (2 * p <= n) {
			result = p / 2;
		} else {
			if ((n & 1) == 0) {
				result = (((p & 1) == 0) ? (n - p) / 2 : (n - p) / 2 + 1);

			} else {
				result = (n - p) / 2;
			}
		}
		System.out.println(result);
		in.close();
	}
}
