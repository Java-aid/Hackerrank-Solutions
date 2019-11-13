/**
 * 
 * Problem Statement-
 * [Beautiful Days at the Movies](https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class BeautifulDaysAtTheMovies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		for (int m = i; m < j; m++) {
			int reversedString = getReversed(m);
			if ((reversedString - m) % k == 0) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

	private static int getReversed(int i) {
		String str = i + "";
		String newValue = "";
		for (int k = str.length() - 1; k >= 0; k--) {
			newValue = newValue + str.charAt(k);
		}
		return Integer.parseInt(newValue);
	}
}
