/**
 * 
 * Problem Statement-
 * [Picking Numbers](https://www.hackerrank.com/challenges/picking-numbers/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Kanahaiya Gupta
 *
 */
public class PickingNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (hmap.containsKey(a[i])) {
				hmap.put(a[i], hmap.get(a[i]) + 1);
			} else {
				hmap.put(a[i], 1);
			}
		}

		Set<Entry<Integer, Integer>> s = hmap.entrySet();
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(s);
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue() - o1.getValue();
			}

		});
		int ksum = 0;
		for (int i = 0; i < list.size(); i++) {
			int key1 = list.get(i).getKey();
			int value1 = list.get(i).getValue();
			int key2 = hmap.containsKey(key1 - 1) ? hmap.get(key1 - 1) : 0;
			int key3 = hmap.containsKey(key1 + 1) ? hmap.get(key1 + 1) : 0;
			int count = key2 > key3 ? key2 : key3;
			int tmp = value1 + count;
			if (ksum < tmp) {
				ksum = tmp;

			}

		}
		System.out.println(ksum);
		sc.close();

	}
}
