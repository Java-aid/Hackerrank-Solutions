/**
 * 
 * Problem Statement-
 * [Binary Numbers](https://www.hackerrank.com/challenges/30-binary-numbers/problem)               
 * 
 */
package com.javaaid.hackerrank.solutions.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Day10BinaryNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int r = n, counter = 0, maxOne = 0;
		String s = "";
		while (n > 0) {

			r = n % 2;
			if (r == 1) {
				counter++;
				if (counter > maxOne) {
					maxOne = counter;
				}
			} else {
				counter = 0;
			}
			s = r + s;
			n = n / 2;

		}
		System.out.println(maxOne);

	}
}
