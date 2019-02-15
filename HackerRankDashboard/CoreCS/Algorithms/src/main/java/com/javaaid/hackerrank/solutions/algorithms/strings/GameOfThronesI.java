/**
 * 
 * Problem Statement-
 * [Game of Thrones - I](https://www.hackerrank.com/challenges/game-of-thrones/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.strings;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class GameOfThronesI {
	static String gameOfThrones(String s) {
		int a[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			a[index]++;
		}
		int oddCount = 0;
		for (int i = 0; i < 26; i++) {
			if (a[i] != 0) {
				if ((a[i] & 1) == 1) {
					oddCount++;
				}
			}
		}
		return oddCount > 1 ? "NO" : "YES";

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = gameOfThrones(s);
		System.out.println(result);
		in.close();
	}
}
