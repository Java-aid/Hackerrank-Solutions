/**
 * 
 * Problem Statement-
 * [Consecutive 1's in Binary Numbers](https://www.hackerrank.com/challenges/linkedin-practice-binary-numbers/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Consecutive1sInBinaryNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		String str = "";
		while (s != 0) {
			int r = s % 2;
			s = s / 2;
			str = str + r;
		}
		int count = 0, mCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				count++;
				if (count > mCount) {
					mCount = count;
				}
			} else {
				count = 0;
			}
		}
		System.out.println(mCount);
		sc.close();
	}

}
