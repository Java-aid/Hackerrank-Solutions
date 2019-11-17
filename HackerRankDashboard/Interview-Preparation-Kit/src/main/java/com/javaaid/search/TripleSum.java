/**
 * 
 * Problem Statement-
 * [Triple sum](https://www.hackerrank.com/challenges/triple-sum/problem) 
 * [Tutorial](https://youtu.be/pVkHLciuank)
 * 
 */
package com.javaaid.search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TripleSum {

	static long triplets(int[] a, int[] b, int[] c) {

		long distinctTripletCount = 0;

		int[] distinctA = removeDuplicates(a);
		int[] distinctB = removeDuplicates(b);
		int[] distinctC = removeDuplicates(c);

		Arrays.sort(distinctA);
		Arrays.sort(distinctB);
		Arrays.sort(distinctC);

		for (int q : distinctB) {
			long c1 = getValidIndex(distinctA, q) + 1;
			long c3 = getValidIndex(distinctC, q) + 1;
			distinctTripletCount += c1 * c3;
		}

		return distinctTripletCount;

	}

	private static int[] removeDuplicates(int[] a) {
		Set<Integer> set = new HashSet<>();
		for (int item : a) {
			set.add(item);
		}
		int len = set.size();

		int result[] = new int[len];
		int i = 0;
		for (int item : set) {
			result[i++] = item;
		}
		return result;
	}

	static int getValidIndex(int[] distinctA, int key) {
		int low = 0;
		int high = distinctA.length - 1;
		int count = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (distinctA[mid] <= key) {
				count = mid;
				low = mid + 1;
			} else
				high = mid - 1;
		}
		return count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lena = sc.nextInt();
		int lenb = sc.nextInt();
		int lenc = sc.nextInt();

		int a[] = new int[lena];
		int b[] = new int[lenb];
		int c[] = new int[lenc];

		for (int i = 0; i < lena; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < lenb; i++) {
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < lenc; i++) {
			c[i] = sc.nextInt();
		}

		long result = triplets(a, b, c);
		System.out.println(result);
		sc.close();
	}
}