/**
 * 
 * Problem Statement-
 * [Let's Review](https://www.hackerrank.com/challenges/30-review-loop/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Day6LetsReview {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int noOfTest = sc.nextInt();
		sc.nextLine();
		String str1 = "", str2 = "";
		for (int i = 0; i < noOfTest; i++) {
			String input = sc.next();
			char[] char1 = input.toCharArray();
			for (int j = 0; j < char1.length; j++) {
				if (j % 2 == 0) {
					str1 = str1 + char1[j];
				} else {
					str2 = str2 + char1[j];

				}
			}
			System.out.println(str1 + " " + str2);
			str1 = str2 = "";
		}
		sc.close();
	}
}
