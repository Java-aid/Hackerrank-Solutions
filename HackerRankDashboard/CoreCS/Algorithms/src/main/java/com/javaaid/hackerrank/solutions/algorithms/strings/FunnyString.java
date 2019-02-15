/**
 * 
 * Problem Statement-
 * [Funny String](https://www.hackerrank.com/challenges/funny-string/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.strings;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class FunnyString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String tmp = sc.next();
			int l = tmp.length();
			boolean found = true;
			for (int j = 1; j < l / 2 + 1; j++) {
				if (!(Math.abs(tmp.charAt(j) - tmp.charAt(j - 1)) == Math
						.abs(tmp.charAt(l - j - 1) - tmp.charAt(l - j)))) {
					found = false;
				}
			}
			System.out.println(found ? "Funny" : "Not Funny");
		}
		sc.close();
	}
}
