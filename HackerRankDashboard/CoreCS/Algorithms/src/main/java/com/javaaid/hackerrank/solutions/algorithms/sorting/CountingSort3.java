/**
 * 
 * Problem Statement-
 * [Counting Sort 3](https://www.hackerrank.com/challenges/countingsort3/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.sorting;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class CountingSort3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int b[] = new int[100];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			sc.next();
		}

		for (int i = 0; i < N; i++) {
			b[a[i]]++;
		}

		for (int i = 1; i < 100; i++) {
			b[i] = b[i] + b[i - 1];
		}

		for (int j = 0; j < 100; j++) {
			System.out.print(b[j] + " ");
		}
		sc.close();
	}

}