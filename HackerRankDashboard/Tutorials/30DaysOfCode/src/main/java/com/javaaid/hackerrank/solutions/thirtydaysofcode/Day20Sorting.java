/**
 * 
 * Problem Statement-
 * [Sorting](https://www.hackerrank.com/challenges/30-sorting/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Day20Sorting {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		in.close();
		int count = 0;
		boolean swapped = true;
		for (int j = a.length - 1; (j >= 0 && swapped); j--) {
			swapped = false;
			for (int k = 0; k < j; k++) {

				if (a[k] > a[k + 1]) {
					int temp = a[k];
					count++;
					a[k] = a[k + 1];
					a[k + 1] = temp;
					swapped = true;
				}
			}
		}
		System.out.println("Array is sorted in " + count + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[a.length - 1]);

	}
}
