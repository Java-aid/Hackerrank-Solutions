/**
 * 
 * Problem Statement-
 * [Between Two Sets](https://www.hackerrank.com/challenges/between-two-sets/problem)         
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class BetweenTwoSets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int gcd = 0;

		int a[] = new int[n];
		int b[] = new int[m];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int lcm = a[0];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
			gcd = findGCD(b[i], gcd);
		}
		for (int i = 0; i < n - 1; i++) {
			lcm = (lcm * a[i + 1]) / findGCD(a[i + 1], lcm);
		}
		int count = 0, t = 0;
		for (int i = 1; i <= gcd && t <= gcd; i++) {
			t = lcm * i;
			if (gcd % (lcm * i) == 0) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

	private static int findGCD(int a, int b) {
		return b == 0 ? a : findGCD(b, a % b);
	}

}
