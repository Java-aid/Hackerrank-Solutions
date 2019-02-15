/**
 * 
 * Problem Statement-
 * [Cut the sticks](https://www.hackerrank.com/challenges/cut-the-sticks/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class CutTheSticks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int tSum = -1;
		while (tSum != 0) {
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				if (min > a[i] && a[i] != 0) {
					min = a[i];
				}

			}
			int count = 0;
			tSum = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] >= min) {
					a[i] = a[i] - min;
					count++;
				}
				tSum += +a[i];
			}

			System.out.println(count);
		}
		sc.close();
	}
}
