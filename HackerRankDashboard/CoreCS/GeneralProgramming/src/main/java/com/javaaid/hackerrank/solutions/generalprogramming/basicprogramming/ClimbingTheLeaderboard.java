/**
 * 
 * Problem Statement-
 * [Climbing the Leaderboard](https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class ClimbingTheLeaderboard {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] scores = new int[n];
		scores[0] = in.nextInt();
		int k = 1, counter = 0;
		for (int scores_i = 1; scores_i < n; scores_i++) {
			int temp = in.nextInt();
			if (temp != scores[k - 1]) {
				scores[k++] = temp;
			} else {
				counter++;
			}
		}

		for (int i = scores.length - 1; i >= 0 && counter > 0; i--) {
			counter--;
			scores[i] = Integer.MIN_VALUE;
		}
		int m = in.nextInt();
		for (int alice_i = 0; alice_i < m; alice_i++) {
			int tmp = in.nextInt();
			if (tmp > scores[0]) {
				System.out.println(1);
			} else if (tmp < scores[scores.length - 1]) {
				System.out.println(scores.length + 1);
			} else {
				System.out.println(binarySearch(scores, tmp) + 1);

			}
		}
		in.close();
	}

	private static int binarySearch(int[] a, int key) {

		int lo = 0;
		int hi = a.length - 1;

		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (a[mid] == key) {
				return mid;
			} else if (a[mid] < key && key < a[mid - 1]) {
				return mid;
			} else if (a[mid] > key && key >= a[mid + 1]) {
				return mid + 1;
			} else if (a[mid] < key) {
				hi = mid - 1;
			} else if (a[mid] > key) {
				lo = mid + 1;
			}
		}
		return -1;
	}

}
