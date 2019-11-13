/**
 * 
 * Problem Statement-
 * [Data Types](https://www.hackerrank.com/challenges/30-data-types)
 * 
 */
package com.javaaid.hackerrank.solutions.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Day1DataTypes {
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int ii = scan.nextInt();
		scan.nextLine();
		double dd = scan.nextDouble();
		scan.nextLine();
		String ss = scan.nextLine();

		System.out.println(i + ii);
		System.out.println(d + dd);
		System.out.println(s + ss);

		/* Read and save an integer, double, and String to your variables. */
		// Note: If you have trouble reading the entire String, please go back and
		// review the Tutorial closely.

		/* Print the sum of both integer variables on a new line. */

		/* Print the sum of the double variables on a new line. */

		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */

		scan.close();
	}
}
