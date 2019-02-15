/**
 * 
 * Problem Statement-
 * [Marc's Cakewalk](https://www.hackerrank.com/challenges/marcs-cakewalk) 
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.sorting;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class MarcsCakewalk {

	public static int[] sort(int a[]) {

		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				} else
					break;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] calories = new int[n];
		for (int calories_i = 0; calories_i < n; calories_i++) {
			calories[calories_i] = in.nextInt();
		}
		int sortedArray[] = sort(calories);
		int j = 0;
		long sum = 0;
		for (int i = sortedArray.length - 1; i >= 0; i--) {
			sum = (sum + sortedArray[i] * (long) Math.pow(2, j++));
		}
		System.out.println(sum);
		in.close();
	}
}
