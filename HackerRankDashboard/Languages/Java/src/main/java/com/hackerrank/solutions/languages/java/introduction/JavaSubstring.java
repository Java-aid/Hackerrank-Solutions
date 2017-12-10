/**
 * 
 */
package com.hackerrank.solutions.languages.java.introduction;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JavaSubstring {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int start = in.nextInt();
		int end = in.nextInt();
		System.out.println(S.substring(start, end));
	}
}
