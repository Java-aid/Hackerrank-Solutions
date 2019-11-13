/**
 * 
 * Problem Statement-
 * [The Maximum Subarray](https://www.hackerrank.com/challenges/maxsubarray/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.dynamicprogramming;

import java.util.Scanner;

public class TheMaximumSubarray {

	static int[] maxSubarray(int[] arr) {
		int max_so_far = Integer.MIN_VALUE, max_end_here = 0, maxSum = 0;
		int ans[] = new int[2];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				maxSum += arr[i];
			max_end_here += arr[i];
			max_end_here = Math.max(max_end_here, arr[i]);
			max_so_far = Math.max(max_so_far, max_end_here);
		}
		ans[0] = max_so_far;
		ans[1] = max_so_far < 0 ? max_so_far : maxSum;
		return ans;

	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int[] arr = new int[n];
			for (int arr_i = 0; arr_i < n; arr_i++) {
				arr[arr_i] = in.nextInt();
			}
			int[] result = maxSubarray(arr);
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
			}
			System.out.println("");

		}
		in.close();
	}
}
