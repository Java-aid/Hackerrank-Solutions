/**
 * 
 * Problem Statement-
 * [Insertion Sort - Part 2](https://www.hackerrank.com/challenges/insertionsort2/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.sorting;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class InsertionSortPart2 {
	public static void insertionSortPart2(int[] ar) {
		for (int i = 1; i < ar.length; i++) {

			for (int j = i; j > 0; j--) {
				if (ar[j] < ar[j - 1]) {
					int temp = ar[j];
					ar[j] = ar[j - 1];
					ar[j - 1] = temp;
				} else {
					break;
				}
			}
			printArray(ar);
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);
		in.close();
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
