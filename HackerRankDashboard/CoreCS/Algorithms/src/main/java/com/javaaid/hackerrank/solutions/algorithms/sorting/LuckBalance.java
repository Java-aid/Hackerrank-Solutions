/**
 * 
 * Problem Statement-
 * [Luck Balance](https://www.hackerrank.com/challenges/luck-balance/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.sorting;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class LuckBalance {
	public static void sort(int a[], int lo, int hi) {
		if (hi > lo) {
			int q = partition(a, lo, hi);
			sort(a, lo, q - 1);
			sort(a, q + 1, hi);
		}
	}

	public static int partition(int a[], int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		while (hi > lo) {

			while (a[++i] < a[lo])
				if (i == hi)
					break;
			while (a[--j] > a[lo])
				if (j == lo)
					break;

			if (i >= j)
				break;
			swap(a, i, j);

		}
		swap(a, lo, j);
		return j;
	}

	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int win = 0;
		int a[] = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			if (sc.nextInt() == 1) {
				win++;
				a[i] = temp;
			} else {
				a[i] = Integer.MAX_VALUE;
			}
			sum += temp;
		}
		sort(a, 0, a.length - 1);
		int s2 = 0;
		for (int i = 0; i < win - K; i++) {
			s2 += a[i];
		}

		System.out.println(sum - 2 * s2);
		sc.close();
	}
}