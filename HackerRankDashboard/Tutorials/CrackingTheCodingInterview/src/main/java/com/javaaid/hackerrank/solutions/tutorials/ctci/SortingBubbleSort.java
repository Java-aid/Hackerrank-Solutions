/**
 * 
 * Problem Statement-
 * [Sorting: Bubble Sort](https://www.hackerrank.com/challenges/ctci-bubble-sort/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.tutorials.ctci;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class SortingBubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int swapCount = bubbleSort(a);
		System.out.println("Array is sorted in " + swapCount + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n - 1]);
	}

	/**
	 * @param a
	 * @return
	 */
	private static int bubbleSort(int[] a) {
		int swapCount = 0;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					swapCount++;
					swap(i, j, a);
				}
			}
		}
		return swapCount;
	}

	/**
	 * @param i
	 * @param j
	 */
	private static void swap(int i, int j, int[] a) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}