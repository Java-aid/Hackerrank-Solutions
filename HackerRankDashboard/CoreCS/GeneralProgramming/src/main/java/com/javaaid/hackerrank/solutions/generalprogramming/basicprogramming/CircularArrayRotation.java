/**
 * 
 * Problem Statement-
 * [Circular Array Rotation](https://www.hackerrank.com/challenges/circular-array-rotation/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class CircularArrayRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		rotateArray(a, k);
		for (int i = 0; i < q; i++) {
			System.out.println(a[sc.nextInt()]);
		}
		sc.close();
	}

	private static void rotateArray(int[] a, int k) {
		if (a.length == 0 || a == null || k < 0) {
			return;
		}
		k = k > a.length ? k % a.length : k;
		int l = a.length - k;
		reverse(a, 0, l - 1);
		reverse(a, l, a.length - 1);
		reverse(a, 0, a.length - 1);
	}

	private static void reverse(int[] a, int i, int j) {
		while (i <= j) {
			int tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
			i++;
			j--;
		}

	}
}
