/**
 * 
 * Problem Statement-
 * [Exceptions - String to Integer](https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Day16ExceptionsStringToInteger {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		in.close();
		int i = 0;
		try {
			i = Integer.parseInt(S);
			System.out.println(i);

		} catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
	}
}