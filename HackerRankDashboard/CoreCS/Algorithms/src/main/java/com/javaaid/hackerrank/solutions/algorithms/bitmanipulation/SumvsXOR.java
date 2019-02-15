/**
 * 
 * Problem Statement-
 * [Sum vs XOR](https://www.hackerrank.com/challenges/sum-vs-xor/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.bitmanipulation;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class SumvsXOR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println((long) Math.pow(2, getNumberOfOnes(n)));
		sc.close();
	}

	private static long getNumberOfOnes(long n) {
		long result = 0;
		while (n != 0) {
			if ((n & 1) == 0) {
				result += 1;
			}
			n >>>= 1;
		}
		return result;
	}
}
