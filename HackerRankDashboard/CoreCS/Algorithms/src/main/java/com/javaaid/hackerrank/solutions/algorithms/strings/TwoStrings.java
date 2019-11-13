/**
 * 
 * Problem Statement-
 * [Two Strings](https://www.hackerrank.com/challenges/two-strings/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.strings;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class TwoStrings {
	static String twoStrings(String s1, String s2) {
		int len = s1.length() < s2.length() ? s1.length() : s2.length();
		int charExist[] = new int[26];

		for (int i = 0; i < len; i++) {
			int index = s1.charAt(i) - 'a';
			charExist[index] = 1;
		}
		for (int i = 0; i < len; i++) {
			int index = s2.charAt(i) - 'a';
			if (charExist[index] > 0)
				return "YES";

		}
		return "NO";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s1 = in.next();
			String s2 = in.next();
			String result = twoStrings(s1, s2);
			System.out.println(result);
		}
	}
}
