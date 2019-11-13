/**
 * 
 * Problem Statement-
 * [Climbing the Leaderboard](https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem)  
 * [Tutorial](https://youtu.be/CAyXHTqBIBU)
 */
package org.javaaid.hackerrank.solutions.implementation.bruteforce;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class ClimbingTheLeaderboard {

	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		int n = scores.length;
		int m = alice.length;

		int res[] = new int[m];
		int[] rank = new int[n];

		rank[0] = 1;

		for (int i = 1; i < n; i++) {
			if (scores[i] == scores[i - 1]) {
				rank[i] = rank[i - 1];
			} else {
				rank[i] = rank[i - 1] + 1;
			}
		}

		for (int i = 0; i < m; i++) {
			int aliceScore = alice[i];
			if (aliceScore > scores[0]) {
				res[i] = 1;
			} else if (aliceScore < scores[n - 1]) {
				res[i] = rank[n - 1] + 1;
			} else {
				int index = binarySearch(scores, aliceScore);
				res[i] = rank[index];

			}
		}
		return res;

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

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] scores = new int[n];

		for (int i = 0; i < n; i++) {
			scores[i] = in.nextInt();
		}

		int m = in.nextInt();
		int[] alice = new int[m];

		for (int i = 0; i < m; i++) {
			alice[i] = in.nextInt();
		}

		int result[] = climbingLeaderboard(scores, alice);
		System.out.println(Arrays.toString(result));
	}

}
