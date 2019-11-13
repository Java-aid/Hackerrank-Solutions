/**
 * 
 * Problem Statement-
 * [QHEAP1](https://www.hackerrank.com/challenges/qheap1/problem)   
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.heaps;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Kanahaiya Gupta
 *
 */
public class QHEAP1 {
	static int a[];
	static int c = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new int[10];
		for (int i = 0; i < n; i++) {
			int q = sc.nextInt();
			int y;
			switch (q) {
			case 1:
				y = sc.nextInt();
				insert(y);
				break;
			case 2:
				y = sc.nextInt();
				delete(y);
				break;
			case 3:
				printMin();
				break;

			}
		}
		sc.close();
	}

	private static void delete(int y) {
		int k = 0;
		boolean found = false;
		for (int i = 0; i < a.length; i++) {
			if (y == a[i]) {
				k = i;
				found = true;
				break;
			}
		}
		if (found) {
			exch(k, c--);
			if (k == 1 || a[k] > a[k / 2]) {
				sink(k);
			} else {
				swim(k);
			}
			a[c + 1] = -1;
		}
	}

	private static void sink(int k) {
		while (2 * k <= c) {
			int j = 2 * k;
			if (j < c && less(j + 1, j))
				j++;
			if (less(k, j))
				break;
			exch(k, j);
			k = j;
		}

	}

	private static void insert(int y) {
		if (c == a.length - 1)
			resize();
		a[++c] = y;
		swim(c);
	}

	private static void resize() {
		int b[] = Arrays.copyOf(a, a.length * 2);
		a = b;
	}

	private static void swim(int k) {
		while (k > 1 && less(k, k / 2)) {
			exch(k, k / 2);
			k = k / 2;
		}

	}

	private static boolean less(int i, int j) {
		return a[i] < a[j];
	}

	private static void exch(int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	private static void printMin() {
		System.out.println(a[1]);
	}

}
