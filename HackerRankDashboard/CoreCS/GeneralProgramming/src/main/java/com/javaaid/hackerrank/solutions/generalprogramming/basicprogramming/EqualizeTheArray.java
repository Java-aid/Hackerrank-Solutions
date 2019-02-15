/**
 * 
 * Problem Statement-
 * [Equalize the Array](https://www.hackerrank.com/challenges/equality-in-a-array/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class EqualizeTheArray {

	static int equalizeArray(int[] arr) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int len = arr.length;
		int maxFreqElement = 0;
		for (int i = 0; i < len; i++) {
			int tmp = arr[i];
			if (hmap.containsKey(tmp)) {
				int oldFreqValue = hmap.get(tmp);
				int newFreqValue = oldFreqValue + 1;
				hmap.put(tmp, newFreqValue);

				if (newFreqValue > maxFreqElement) {
					maxFreqElement = newFreqValue;
				}
			} else {
				hmap.put(tmp, 1);
			}
		}
		return len - maxFreqElement;
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
