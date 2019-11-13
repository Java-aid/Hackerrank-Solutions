/**
 * 
 * Problem Statement-
 * [Running Time of Algorithms](https://www.hackerrank.com/challenges/runningtime/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.sorting;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class RunningTimeOfAlgorithms {
	public static int shiftCount(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(shiftCount(a));
		sc.close();
	}
}
