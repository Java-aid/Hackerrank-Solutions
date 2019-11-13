/**
 * 
 * Problem Statement-
 * [Big Sorting](https://www.hackerrank.com/challenges/big-sorting/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class BigSorting {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] unsorted = new String[n];
		for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
			unsorted[unsorted_i] = in.next();
		}

		Arrays.sort(unsorted, new Comparator<String>() {

			public int compare(String s1, String s2) {
				return compareStrings(s1, s2);
			}
		});
		printArray(unsorted);
		in.close();
	}

	private static int compareStrings(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		} else if (s1.length() > s2.length()) {
			return 1;
		}
		for (int k = 0; k < s1.length(); k++) {
			if ((int) s1.charAt(k) < (int) s2.charAt(k))
				return -1;
			if ((int) s1.charAt(k) > (int) s2.charAt(k))
				return 1;

		}
		return 0;

	}

	private static void printArray(String[] unsorted) {

		for (String string : unsorted) {
			System.out.println(string);
		}

	}

}
