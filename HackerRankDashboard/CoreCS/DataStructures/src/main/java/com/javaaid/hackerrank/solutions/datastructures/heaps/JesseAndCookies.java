/**
 * 
 * Problem Statement-
 * [Jesse and Cookies](https://www.hackerrank.com/challenges/jesse-and-cookies/problem)   
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.heaps;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JesseAndCookies {
	static int A[];
	static int c;
	static int N = 0;
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int K = sc.nextInt();
		c = 0;
		A = new int[N + 1];
		A[1] = sc.nextInt();
		c++;
		for (int i = 2; i <= N; i++) {
			int item = sc.nextInt();
			insert(item);
		}
		boolean found = false;
		for (int i = 1; i <= N; i++) {
			if (A[1] < K) {
				count++;
				int m1 = getMin();
				delete(1);
				int m2 = getMin();
				delete(1);
				int m3 = m1 + 2 * m2;
				insert(m3);
			} else {
				found = true;
				break;
			}

		}
		System.out.println(found ? count : -1);
		sc.close();
	}

	private static int getMin() {
		return A[1];
	}

	private static void delete(int k) {
		exch(1, c--);
		sink(1);

	}

	private static void sink(int k) {
		while (2 * k <= c) {
			int j = 2 * k;
			if (j < c && A[j] > A[j + 1])
				j++;
			if (A[k] < A[j])
				break;
			exch(j, k);
			k = j;

		}

	}

	private static void insert(int item) {
		if (c == A.length - 1)
			resize();
		A[++c] = item;
		swim(c);
	}

	private static void swim(int k) {
		while (k > 1 && A[k] < A[k / 2]) {
			exch(k, k / 2);
			k = k / 2;
		}
	}

	private static void exch(int i, int j) {
		int t = A[i];
		A[i] = A[j];
		A[j] = t;
	}

	private static void resize() {
		int[] b = Arrays.copyOf(A, A.length * 2);
		A = b;
	}

}
