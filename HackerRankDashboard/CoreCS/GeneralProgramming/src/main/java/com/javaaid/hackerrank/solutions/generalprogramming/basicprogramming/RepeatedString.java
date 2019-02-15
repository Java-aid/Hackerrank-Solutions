/**
 * 
 * Problem Statement-
 * [Repeated String](https://www.hackerrank.com/challenges/repeated-string/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class RepeatedString {
	public static long getLetterCount(String word, long length) {
		long count = 0;
		for (int i = 0; i < length; i++) {
			if (word.charAt(i) == 'a')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int l = word.length();
		long freq = sc.nextLong();
		long q = 0, r = 0;
		q = freq / l;
		r = freq % l;
		long length = (r == 0) ? 0 : r;
		long aCount = q * getLetterCount(word, word.length()) + getLetterCount(word, length);
		System.out.println(aCount);
		sc.close();
	}

}
