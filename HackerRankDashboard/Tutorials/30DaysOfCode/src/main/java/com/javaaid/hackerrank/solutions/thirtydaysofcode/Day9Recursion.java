/**
 * 
 * Problem Statement-
 * [Recursion](https://www.hackerrank.com/challenges/30-recursion/problem)                   
 * 
 */
package com.javaaid.hackerrank.solutions.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Day9Recursion {
	public static int factorial(int i) {
		if (i == 1 || i == 0) {
			return 1;
		} else {
			return i * factorial(i - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(factorial(i));
		sc.close();
	}
}
