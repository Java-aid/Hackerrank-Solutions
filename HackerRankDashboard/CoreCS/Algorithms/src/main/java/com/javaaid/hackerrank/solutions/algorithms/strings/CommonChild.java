/**
 * 
 * Problem Statement-
 * [Common Child](https://www.hackerrank.com/challenges/common-child/problem) 
 * [Tutorial](https://youtu.be/ItRZRx8kvwY)
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.strings;

import java.util.Scanner;

public class CommonChild {

	static int commonChild(String s1, String s2) {
		return LCSM4(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length());

	}

	public static int LCSM4(char[] X, char[] Y, int m, int n) {
		int memo[] = new int[n + 1];

		for (int i = 1; i <= m; i++) {
			int prev = 0;
			for (int j = 1; j <= n; j++) {
				int temp = memo[j];
				if (X[i - 1] == Y[j - 1]) {
					memo[j] = prev + 1;
				} else {
					memo[j] = Math.max(memo[j], memo[j - 1]);
				}
				prev = temp;
			}

		}
		return memo[n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int result = commonChild(s1, s2);
		System.out.println(result);
		sc.close();
	}

}
