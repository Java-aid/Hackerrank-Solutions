/**
 * 
 * Problem Statement-
 * [Utopian Tree](https://www.hackerrank.com/challenges/utopian-tree/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class UtopianTree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int height = 1;
		for (int i = 0; i < T; i++) {
			int c = sc.nextInt();
			for (int j = 1; j <= c; j++) {
				if ((j & 1) == 1) {
					height *= 2;
				} else {
					height++;
				}
			}
			System.out.println(height);
			height = 1;

		}
		sc.close();
	}
}