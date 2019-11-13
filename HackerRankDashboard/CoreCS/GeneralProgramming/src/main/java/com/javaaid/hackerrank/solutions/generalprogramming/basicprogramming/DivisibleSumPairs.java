/**
 * 
 * Problem Statement-
 * [Divisible Sum Pairs](https://www.hackerrank.com/challenges/divisible-sum-pairs/problem)        
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class DivisibleSumPairs {

	static int divisibleSumPairs(int n, int k, int[] ar) {
		int[] bucket = new int[k];
		int pairCounter = 0;

		for (int element : ar) {

			int remainder = element % k;
			int complement = (k-remainder)%k;
			pairCounter += ar[complement];
			bucket[remainder]++;

		}
		return pairCounter;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
//		int count = 0;
//		for (int i = 0; i < M; i++) {
//			for (int j = i + 1; j < M; j++) {
//				if ((a[i] + a[j]) % N == 0) {
//					count++;
//				}
//			}
//		}
		int count = divisibleSumPairs(n, k, a);
		System.out.println(count);
		sc.close();
	}

}
