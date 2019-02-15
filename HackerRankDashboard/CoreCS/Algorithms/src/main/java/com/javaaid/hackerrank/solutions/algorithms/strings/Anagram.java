/**
 * 
 * Problem Statement-
 * [Anagram](https://www.hackerrank.com/challenges/anagram/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.strings;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Anagram {
	static int anagram(String s) {
		int minNoOfChanes = 0;
		if ((s.length() & 1) == 1)
			return -1;
		int charFreq[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			if (i < s.length() / 2) {
				charFreq[index]++;
			} else {
				charFreq[index]--;
			}
		}
		for (int i = 0; i < 26; i++) {
			if (charFreq[i] > 0) {
				minNoOfChanes += charFreq[i];
			}

		}
		return minNoOfChanes;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			int result = anagram(s);
			System.out.println(result);
			in.close();
		}
	}
}
