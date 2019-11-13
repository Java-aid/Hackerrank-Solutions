/**
 * 
 * Problem Statement-
 * [Taum and B'day](https://www.hackerrank.com/challenges/taum-and-bday/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class TaumAndBday {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long b = in.nextLong();
			long w = in.nextLong();
			long x = in.nextLong();
			long y = in.nextLong();
			long z = in.nextLong();
			long cost = 0;
			if (x > y + z) {
				cost = b * (y + z) + w * y;
			} else if (y > x + z) {
				cost = b * x + w * (x + z);
			} else {
				cost = x * b + y * w;
			}
			System.out.println(cost);
		}
		in.close();
	}
}