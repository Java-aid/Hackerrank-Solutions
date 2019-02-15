/**
 * 
 * Problem Statement-
 * [Append and Delete](https://www.hackerrank.com/challenges/append-and-delete/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class AppendAndDelete {
	static String appendAndDelete(String s, String t, int k) {
		String result = "No";
		int sLength = s.length();
		int tlength = t.length();
		int len = sLength > tlength ? tlength : sLength;
		int matchCharCount = 0;
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == t.charAt(i)) {
				matchCharCount++;
			} else {
				break;
			}
		}
		int minOpRequired = sLength + tlength - 2 * matchCharCount;
		if (k == minOpRequired) {
			return result = "Yes";
		} else if (k > minOpRequired && (k - minOpRequired) % 2 == 0 || k >= (sLength + tlength)) {
			result = "Yes";
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		int k = in.nextInt();
		String result = appendAndDelete(s, t, k);
		System.out.println(result);
		in.close();
	}
}
