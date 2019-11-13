/**
 * 
 * Problem Statement-
 * [Beautiful Triplets](https://www.hackerrank.com/challenges/beautiful-triplets/problem)   
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
public class BeautifulTriplets {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		int n = in.nextInt();
		int d = in.nextInt();
		for (int i = 0; i < n; i++) {
			int value = in.nextInt();
			hmap.put(value, value);
		}
		Set<Entry<Integer, Integer>> set = hmap.entrySet();
		int count = 0;
		for (Entry<Integer, Integer> entry : set) {
			int key = entry.getKey();
			if (hmap.containsKey(key - d) && hmap.containsKey(key) && hmap.containsKey(key + d)
					|| hmap.containsKey(key) && hmap.containsKey(key + 2d) && hmap.containsKey(key + d)) {
				count++;
			}
		}
		System.out.println(count);
		in.close();
	}
}
