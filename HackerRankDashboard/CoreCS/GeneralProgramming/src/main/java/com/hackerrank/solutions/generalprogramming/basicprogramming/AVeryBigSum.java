/**
 * 
 */
package com.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class AVeryBigSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long arr[] = new long[n];
		long sum = 0;

		for (int arr_i = 0; arr_i < n; arr_i++) {
			sum += in.nextLong();
		}
		System.out.println(sum);

	}
}