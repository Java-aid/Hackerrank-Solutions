/**
 * 
 * Problem Statement-
 * [Arrays: Left Rotation](https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.tutorials.ctci;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class LeftRotation {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int key = sc.nextInt();
		int a[] = new int[arraySize];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		leftRotate(a, 0, key - 1);
		leftRotate(a, key, arraySize - 1);
		leftRotate(a, 0, arraySize - 1);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}

	static void leftRotate(int a[], int start, int end) {
		while (start < end) {
			int temp = a[start];
			a[start++] = a[end];
			a[end--] = temp;

		}

	}
}