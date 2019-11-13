/**
 * 
 * Problem Statement-
 * [Find the Median](https://www.hackerrank.com/challenges/find-the-median/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class FindTheMedian {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		if ((n & 1) == 1) {
			System.out.println(a[n / 2]);
		} else {
			System.out.println((a[n / 2] + a[n / 2 + 1]) / 2);
		}
		sc.close();
	}
}
