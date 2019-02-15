/**
 * 
 * Problem Statement-
 * [Minimum Absolute Difference in an Array](https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array) 
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.sorting;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class MinimumAbsoluteDifferenceInAnArray {
	public static void sort(int a[], int lo, int hi) {
		if (hi > lo) {
			int q = partition(a, lo, hi);
			sort(a, lo, q - 1);
			sort(a, q + 1, hi);
		}

	}

	public static int partition(int[] a, int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		while (hi > lo) {
			while (a[++i] < a[lo])
				if (i == hi)
					break;
			while (a[--j] > a[lo])
				if (j == lo)
					break;

			if (i >= j)
				break;
			swap(a, i, j);
		}
		swap(a, lo, j);
		return j;

	}

	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		sort(a, 0, a.length - 1);
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < a.length; i++) {
			int diff = a[i] - a[i - 1];
			if (diff < min) {
				min = diff;
			}
		}
		System.out.println(min);
		in.close();
	}
}
