/**
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.search;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class BitManipulationLonelyInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int res = 0;
		for (int i = 0; i < n; i++) {
			res ^= sc.nextInt();
		}
		System.out.println(res);
	}
}
