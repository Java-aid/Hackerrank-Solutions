/**
 * 
 * Problem Statement-
 * [MoreExceptions](https://www.hackerrank.com/challenges/30-more-exceptions/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
class Calculator {
	int power(int n, int p) throws Exception {

		if (p < 0 || n < 0)
			throw new Exception("n and p should be non-negative");
		return (int) Math.pow(n, p);
	}
}

public class Day17MoreExceptions {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt();
			int p = in.nextInt();
			Calculator myCalculator = new Calculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();
	}
}
