/**
 * 
 * Problem Statement-
 * [Quicksort 1 - Partition](https://www.hackerrank.com/challenges/quicksort1)
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.sorting;

import java.util.Scanner;

/**
 * 
 * @author Kanahaiya Gupta
 *
 */
public class Quicksort1Partition {

	public static void partition(int[] a, int lo, int hi) {
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
		printArray(a);
	}

	private static void swap(int array[], int i, int j) {
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}

	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		partition(a, 0, a.length - 1);
		sc.close();

	}
}
