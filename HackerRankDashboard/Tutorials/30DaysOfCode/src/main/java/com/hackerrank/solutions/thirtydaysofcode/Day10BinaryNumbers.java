/**
 * 
 */
package com.hackerrank.solutions.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Day10BinaryNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int r = n, i = 0, counter = 0, maxOne = 0;
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
