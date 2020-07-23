/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.strings;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Kanahaiya Gupta
 *
 */
public class PatternSyntaxChecker {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases-- > 0) {
			String pattern = in.nextLine();
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (Exception e) {
				System.out.println("Invalid");
			}
		}
		in.close();
	}
}
