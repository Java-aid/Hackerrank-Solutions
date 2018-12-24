/**
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class MiniMaxSum {
	static void miniMaxSum(int[] arr) {
		long min = 0, max = 0, sum = 0;
		min = arr[0];
		max = min;
		sum = min;
		for (int i = 1; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.print((sum - max) + " " + (sum - min));

	}
}
