/**
 * 
 * Problem Statement-
 * [Non-Divisible Subset](https://www.hackerrank.com/challenges/non-divisible-subset/problem)   
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class NonDivisibleSubset {
	static int nonDivisibleSubset(int k, int[] arr) {
		int reminders[] = new int[k];
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int index = num % k;
			reminders[index]++;
		}
		int size = 0;
		for (int i = 1; i <= k / 2; i++) {
			if (i * 2 == k) {
				size++;
			} else {
				size += Math.max(reminders[i], reminders[k - i]);
			}
		}
		return reminders[0] != 0 ? size + 1 : size;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int result = nonDivisibleSubset(k, arr);
		System.out.println(result);
		in.close();
	}
}