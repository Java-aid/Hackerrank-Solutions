/**
 * 
 * Problem Statement-
 * [Recursive Digit Sum](https://www.hackerrank.com/challenges/recursive-digit-sum/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.recursion;

import java.math.BigInteger;

public class RecursiveDigitSum {

	// method 1 -> recursive solution
	static int digitSum(String n, int k) {
		long superDigit = getSuperDigit(n);
		long n1 = getSuperDigit(superDigit);
		long k1 = getSuperDigit(k);

		long result = n1 * k1;

		while (result / 10 != 0) {
			result = getSuperDigit(result);
		}

		return (int) result;
	}

	private static long getSuperDigit(String n) {
		if (n == null || n.isEmpty())
			return 0;
		return (n.charAt(0) - '0') + getSuperDigit(n.substring(1));
	}

	private static long getSuperDigit(long n) {
		if (n / 10 != 0)
			return (n % 10) + getSuperDigit(n / 10);
		return (n % 10);
	}

	// method 2 > Iterative solutions hint -->http://applet-magic.com/digitsummod9.htm
	static int digitSumUsingMathTrick(String n, int k) {
		BigInteger n1 = new BigInteger(n);
		n1 = n1.multiply(new BigInteger(k + ""));
		n1 = n1.remainder(new BigInteger("9"));
		return n1.intValue() == 0 ? 9 : n1.intValue();

	}
	
	

}
