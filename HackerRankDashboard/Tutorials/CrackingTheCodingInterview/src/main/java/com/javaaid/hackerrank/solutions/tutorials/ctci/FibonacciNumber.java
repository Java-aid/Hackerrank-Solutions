/**
 * 
 * Problem Statement-
 * [Recursion: Fibonacci Numbers](https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.tutorials.ctci;
/******************************************************************************
 *  Execution:    java  FibonacciNumber
 *  
 *  Algorithm:
 *  To solve this problem, we need to split the problem into a base case
 *   (the point at which we will stop performing operations) and a recursive case
 *   (the base case is not yet reached, so the function calls itself in such a way that we approach � and eventually reach � the base case).
 *   Base Case :
 *	  We must know the value of two consecutive elements to calculate the value of the next element in the sequence (i.e., ).
.*  fibonacci(n)=fibonacci(n-1)+fibonacci(n-2)   if n>1
 *	  fibonacci(n==0)=0
 *  fibonacci(n==1)=1
 *  Thus, we consider the base case to be when we reach the first two elements of the series.
 *  Recursive Case:
 *  We've already defined our base case, so we define our recursive case to be everything 
 *  else not satisfying the base case. 
 *  This means that any other valid value of  (i.e., whenever ) should be handled recursively.
 *   So how do we call the function in a way that guarantees we'll eventually reach the base case?
 ******************************************************************************/

import java.util.Scanner;

/**
 * The {@code FibonacciNumber} class represents a number generator to generate
 * Fibonacci Number
 * 
 * @author Kanahaiya Gupta
 */
public class FibonacciNumber {

	/**
	 * This method is used to generate the nth fibonacci number
	 * 
	 * @param n
	 * @return a nth fibonacci number
	 */
	public static int fibonacci(int n) {
		if (n == 0 || n == 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);

	}

	/**
	 * Unit tests the {@code FibonacciNumber}
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		System.out.println(fibonacci(n));
	}
}
