/**
 * 
 * Problem Statement-
 * [Insertion Sort - Part 1](https://www.hackerrank.com/challenges/insertionsort1/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.sorting;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class InsertionSortPart1 {
	public static void insertIntoSorted(int[] ar) {
		int length = ar.length;
		int elementNeedToBeInserted = ar[length - 1];
		for (int i = length - 2; i >= 0; i--) {
			if (ar[i] > elementNeedToBeInserted) {
				ar[i + 1] = ar[i];
				printArray(ar);

			} else {
				ar[i + 1] = elementNeedToBeInserted;
				printArray(ar);
				break;
			}
			if ((i == 0) && (ar[i] > elementNeedToBeInserted)) {
				ar[i] = elementNeedToBeInserted;
				printArray(ar);
			}
		}

	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
		in.close();
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
