/**
 * 
 * Problem Statement-
 * [Birthday Chocolate](https://www.hackerrank.com/challenges/the-birthday-bar/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class BirthdayChocolate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int a[] = new int[M];
		for (int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
		}
		int d = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0, count = 0;
		if (M <= m) {
			for (int j = 0; j < M; j++) {
				sum += a[j];
				if (sum == d) {
					count++;
				}
			}
		} else {
			for (int i = 0; i <= M - m; i++) {
				for (int j = i; j < i + m; j++) {
					sum += a[j];
				}

				if (sum == d) {
					count++;
				}
				sum = 0;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
