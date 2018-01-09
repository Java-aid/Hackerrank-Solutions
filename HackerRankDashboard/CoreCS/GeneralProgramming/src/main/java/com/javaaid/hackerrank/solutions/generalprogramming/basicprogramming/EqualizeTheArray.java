/**
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Kanahaiya Gupta
 *
 */
public class EqualizeTheArray {
	public static void main(String[] args) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			if (hmap.containsKey(tmp)) {
				hmap.put(tmp, hmap.get(tmp) + 1);
			} else {
				hmap.put(tmp, 1);
			}
		}
		int max = 0;
		Set<Entry<Integer, Integer>> s = hmap.entrySet();
		for (Entry<Integer, Integer> entry : s) {
			int value = entry.getValue();
			if (value > max) {
				max = value;
			}

		}
		System.out.println(a.length - max);
		sc.close();
	}
}
