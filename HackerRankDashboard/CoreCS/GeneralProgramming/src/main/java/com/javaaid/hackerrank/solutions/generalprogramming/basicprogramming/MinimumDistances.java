/**
 * 
 * Problem Statement-
 * [Minimum Distances](https://www.hackerrank.com/challenges/minimum-distances/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class MinimumDistances {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int min = Integer.MAX_VALUE, si = 0, ei = 0;
		for (int i = 0; i < n; i++) {

			if (hmap.containsKey(a[i])) {
				ei = i;
				si = hmap.get(a[i]);
				if (min > (ei - si)) {
					min = ei - si;
				}
			} else {
				hmap.put(a[i], i);
			}
		}
		System.out.println(min == Integer.MAX_VALUE ? -1 : min);
		sc.close();
	}
}
