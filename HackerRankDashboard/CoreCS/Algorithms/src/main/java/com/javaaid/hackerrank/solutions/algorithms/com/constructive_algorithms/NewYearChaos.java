
/**
 * 
 * Problem Statement-
 * [New Year Chaos](https://www.hackerrank.com/challenges/new-year-chaos/problem) 
 * [Tutorial](https://youtu.be/YWYF6bOhPW8)
 */

package com.javaaid.hackerrank.solutions.algorithms.com.constructive_algorithms;

import java.util.Scanner;

public class NewYearChaos {

	private static void minimumBribes(int[] arr) {
		int swapCount = 0;

		for (int i = arr.length - 1; i >= 0; i--) {

			if (arr[i] != i + 1) { // filter cases, when you do not bribe, be at the ith position wherever you are

				if (((i - 1) >= 0) && arr[i - 1] == (i + 1)) { // 1)Being at initial ith position, valid current
																// position after given bribe can be (i-1)th position
					swapCount++;
					swap(arr, i, i - 1);
				} else if (((i - 2) >= 0) && arr[i - 2] == (i + 1)) { // 2)Being at initial ith position, valid current
																		// position after given bribes can be (i-2)th
																		// position
					swapCount += 2;
					swap(arr, i - 2, i - 1);
					swap(arr, i - 1, i);
				} else { // 3)Too chaotic (trying to bribe more than 2 people which is ahead of you)
					System.out.println("Too chaotic");
					return;
				}
			}

		}
		System.out.println(swapCount);

	}

	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			minimumBribes(a);
		}
		sc.close();
	}

}
