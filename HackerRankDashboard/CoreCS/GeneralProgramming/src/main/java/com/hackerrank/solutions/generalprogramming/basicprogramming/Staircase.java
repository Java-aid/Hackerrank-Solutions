/**
 * 
 */
package com.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Staircase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = "#";
		for (int i = 0; i < n; i++) {
			System.out.printf("%" + (n) + "s \n", str);
			str += "#";
		}
	}
}
