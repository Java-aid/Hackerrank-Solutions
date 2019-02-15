/**
 * 
 * Problem Statement-
 * [Jumping on the Clouds](https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem)   
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JumpingOnTheClouds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n + 2];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n - 1;) {
			if (a[i + 2] != 1) {
				i++;
			}
			i++;
			count++;

		}
		System.out.println(count);
		sc.close();
	}
}
