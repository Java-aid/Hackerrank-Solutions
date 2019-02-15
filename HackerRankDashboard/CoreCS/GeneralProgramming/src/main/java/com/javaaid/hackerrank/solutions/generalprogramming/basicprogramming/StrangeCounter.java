/**
 * 
 * Problem Statement-
 * [Strange Counter](https://www.hackerrank.com/challenges/strange-code/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class StrangeCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long i = 0;
		long lValue = (long) (3 * Math.pow(2, i)) - 2;
		long hValue = 2 * lValue + 1;

		while (hValue < n) {
			lValue = (long) (3 * Math.pow(2, ++i)) - 2;
			hValue = 2 * lValue + 1;
		}
		System.out.println(hValue + 1 - n);
		sc.close();
	}

}
