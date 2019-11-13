/**
 * 
 * Problem Statement-
 * [Library Fine](https://www.hackerrank.com/challenges/library-fine/problem)   
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class LibraryFine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String d1 = sc.nextLine();
		String d2 = sc.nextLine();

		String[] aDate = d1.split(" ");
		String[] eDate = d2.split(" ");

		int ad = Integer.parseInt(aDate[0]);
		int am = Integer.parseInt(aDate[1]);
		int ay = Integer.parseInt(aDate[2]);

		int ed = Integer.parseInt(eDate[0]);
		int em = Integer.parseInt(eDate[1]);
		int ey = Integer.parseInt(eDate[2]);
		int fine = 0;
		if (ay > ey) {
			fine = 10000;
		} else {

			if (ay == ey && am > em) {
				fine = 500 * (am - em);
			} else {
				if (ay == ey && am == em && ad > ed) {
					fine = 15 * (ad - ed);
				}
			}
		}
		System.out.println(fine);
		sc.close();
	}
}
