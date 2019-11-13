/**
 * 
 * Problem Statement-
 * [Counting Sort 2](https://www.hackerrank.com/challenges/countingsort2/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.sorting;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class CountingSort2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int b[] = new int[100];
		int c[] = new int[N + 1];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			b[a[i]]++;
		}

		for (int i = 1; i < 100; i++) {
			b[i] = b[i] + b[i - 1];
		}

		for (int j = 0; j < N; j++) {
			c[b[a[j]]] = a[j];
			b[a[j]] = b[a[j]] - 1;
		}

		for (int j = 1; j <= N; j++) {
			System.out.print(c[j] + " ");
		}
		sc.close();
	}

}
