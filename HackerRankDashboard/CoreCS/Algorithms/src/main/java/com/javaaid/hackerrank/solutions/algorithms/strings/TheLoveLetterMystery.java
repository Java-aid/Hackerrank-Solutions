/**
 * 
 * Problem Statement-
 * [The Love-Letter Mystery](https://www.hackerrank.com/challenges/the-love-letter-mystery/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.strings;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class TheLoveLetterMystery {
	static int theLoveLetterMystery(String s) {
		// Complete this function
		int minOpCount = 0;
		int strLen = s.length();
		for (int i = 0; i < strLen / 2; i++) {
			minOpCount += Math.abs(s.charAt(i) - s.charAt(strLen - i-1));
		}
		return minOpCount;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			int result = theLoveLetterMystery(s);
			System.out.println(result);
		}
		in.close();
	}
}
