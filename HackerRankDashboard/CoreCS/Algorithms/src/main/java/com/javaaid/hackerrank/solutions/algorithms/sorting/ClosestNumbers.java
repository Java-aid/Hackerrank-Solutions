/**
 * 
 * Problem Statement-
 * [Closest Numbers](https://www.hackerrank.com/challenges/closest-numbers/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class ClosestNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a[] = new int[t];
		for (int i = 0; i < t; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int minDiff = Integer.MAX_VALUE;
		int min1 = 0;
		int min2 = 0, minIndex = -1;

		String result = "";
		for (int i = 1; i < t; i++) {
			int diff = Math.abs(a[i] - a[i - 1]);
			if (diff < minDiff) {
				minDiff = diff;
				min1 = a[i - 1];
				min2 = a[i];
				minIndex = i;
				result = min1 + " " + min2;
			}
		}
		for (int i = minIndex + 1; i < t; i++) {
			if (minDiff == Math.abs(a[i] - a[i - 1])) {
				result = result + " " + a[i - 1] + " " + a[i];
			}
		}
		System.out.println(result);
		sc.close();
	}
}
