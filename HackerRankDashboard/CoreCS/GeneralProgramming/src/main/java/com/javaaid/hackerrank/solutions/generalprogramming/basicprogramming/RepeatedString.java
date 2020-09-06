/**
 * 
 * Problem Statement-
 * [Repeated String](https://www.hackerrank.com/challenges/repeated-string/problem) 
 * [Tutorial]()
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class RepeatedString {

	static long repeatedString(String s, long n) {
		int strLength = s.length();
		long q = 0, r = 0;
		q = n / strLength;
		r = n % strLength;
		long partialStrLen = (r == 0) ? 0 : r;
		long aCount = q * getLetterCount(s, s.length()) + getLetterCount(s, partialStrLen);
		return aCount;
	}

	public static long getLetterCount(String s, long strLength) {
		long count = 0;
		for (int i = 0; i < strLength; i++) {
			if (s.charAt(i) == 'a')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long n = sc.nextLong();
		long aCount = repeatedString(s, n);
		System.out.println(aCount);
		sc.close();
	}

}
