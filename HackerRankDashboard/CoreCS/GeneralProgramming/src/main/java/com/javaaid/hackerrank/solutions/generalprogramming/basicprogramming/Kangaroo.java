/**
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Kangaroo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float x1 = in.nextInt();
		float v1 = in.nextInt();
		float x2 = in.nextInt();
		float v2 = in.nextInt();
		float jumpNumber = (x1 - x2) % (v2 - v1);
		if (v1 - v2 > 0 && jumpNumber == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		in.close();
	}
}