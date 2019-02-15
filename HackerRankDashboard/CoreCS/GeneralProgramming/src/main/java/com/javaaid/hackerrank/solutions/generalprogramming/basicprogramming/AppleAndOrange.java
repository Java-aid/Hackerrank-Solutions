/**
 * 
 * Problem Statement-
 * [Apple and Orange](https://www.hackerrank.com/challenges/apple-and-orange/problem)         
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class AppleAndOrange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		int aCount = 0, oCount = 0;
		for (int i = 0; i < m; i++) {
			int temp = sc.nextInt();
			if ((a + temp) >= s && (a + temp) <= t) {
				aCount++;
			}
		}

		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			if ((b + temp) >= s && (b + temp) <= t) {
				oCount++;
			}
		}
		System.out.println(aCount);
		System.out.println(oCount);
		sc.close();
	}
}
