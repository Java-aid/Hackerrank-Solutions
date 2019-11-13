/**
 * 
 * Problem Statement-
 * [String Construction](https://www.hackerrank.com/challenges/string-construction/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.strings;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class StringConstruction {
	static int stringConstruction(String s) {
		int count = 0;
		int charArray[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			charArray[index]++;
		}
		for (int i = 0; i < 26; i++) {
			if (charArray[i] != 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			int result = stringConstruction(s);
			System.out.println(result);
		}
		in.close();
	}
}