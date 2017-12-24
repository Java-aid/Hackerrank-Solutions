/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.strings;

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
		in.close();
	}
}
