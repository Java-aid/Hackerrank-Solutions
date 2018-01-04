/**
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class CountingValleys {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int vCount = 0, upCount = 0;
		boolean comingFromSeeLevel = true;
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			if (ch == 'U') {
				upCount++;
			} else if (ch == 'D') {
				upCount--;
			}
			if (upCount < 0 && comingFromSeeLevel) {
				vCount++;
				comingFromSeeLevel = false;
			} else if (upCount >= 0) {
				comingFromSeeLevel = true;
			}

		}
		System.out.println(vCount);
		sc.close();
	}
}
