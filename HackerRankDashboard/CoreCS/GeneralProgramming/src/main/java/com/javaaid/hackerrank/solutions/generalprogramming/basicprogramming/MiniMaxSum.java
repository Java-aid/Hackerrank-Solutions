/**
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class MiniMaxSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long min, max, sum = 0;
		min = in.nextLong();
		max = min;
		sum = min;
		for (int i = 0; i < 4; i++) {
			long a = in.nextLong();
			sum += a;
			if (a < min) {
				min = a;
			}
			if (a > max) {
				max = a;
			}
		}
		System.out.print((sum - max) + " " + (sum - min));
		in.close();
	}
}
