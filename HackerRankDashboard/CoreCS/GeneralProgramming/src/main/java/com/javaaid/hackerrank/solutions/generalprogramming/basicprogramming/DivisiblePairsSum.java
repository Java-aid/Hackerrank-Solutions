/**
 * 
 * Problem Statement-
 * [Divisible Pairs Sum](https://www.hackerrank.com/challenges/linkedin-practice-divisible-sum-pairs/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class DivisiblePairsSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();

		int N = sc.nextInt();
		int a[] = new int[M];
		for (int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < M; i++) {
			for (int j = i + 1; j < M; j++) {
				if ((a[i] + a[j]) % N == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

}
