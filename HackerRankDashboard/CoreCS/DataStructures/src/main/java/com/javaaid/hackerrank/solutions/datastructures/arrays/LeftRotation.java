package com.javaaid.hackerrank.solutions.datastructures.arrays;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class LeftRotation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arraySize = s.nextInt();
		int key = s.nextInt();
		int a[] = new int[arraySize];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}

		leftRotate(a, 0, key - 1);
		leftRotate(a, key, arraySize - 1);
		leftRotate(a, 0, arraySize - 1);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	static void leftRotate(int a[], int start, int end) {
		while (start < end) {
			int temp = a[start];
			a[start++] = a[end];
			a[end--] = temp;

		}

	}
}