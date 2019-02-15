/**
 * 
 * Problem Statement-
 * [Extra Long Factorials](https://www.hackerrank.com/challenges/extra-long-factorials/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class ExtraLongFactorials {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		BigInteger b = BigInteger.ONE;
		while (n >= 1) {
			b = b.multiply(new BigInteger(n + ""));
			n--;
		}
		System.out.println(b);
		in.close();
	}
}
