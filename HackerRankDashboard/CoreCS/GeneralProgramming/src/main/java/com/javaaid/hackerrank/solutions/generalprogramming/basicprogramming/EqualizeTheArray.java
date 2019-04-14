/**
 * 
 * Problem Statement-
 * [Equalize the Array](https://www.hackerrank.com/challenges/equality-in-a-array/problem)
 * [Tutorial](https://youtu.be/Pdyvr669adE)
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class EqualizeTheArray {

	static int equalizeArray(int[] arr) {
		int len = arr.length;
		int aux[] = new int[101];
		for (int i = 0; i < len; i++) {
			int index = arr[i];
			aux[index]++;
		}

		int maxFreqCount = getMaxFreqCount(aux);
		return len - maxFreqCount;
	}

	private static int getMaxFreqCount(int[] aux) {
		int maxFreqCount = Integer.MIN_VALUE;
		for (int freqCount : aux) {
			if (freqCount > maxFreqCount) {
				maxFreqCount = freqCount;
			}
		}
		return maxFreqCount;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(equalizeArray(a));
		sc.close();
	}
}
