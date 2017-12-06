/**
 * 
 */
package com.hackerrank.solutions.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Day16ExceptionsStringToInteger {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int i = 0;
		try {
			i = Integer.parseInt(S);
			System.out.println(i);

		} catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
	}
}