/**
 * 
 * Problem Statement-
 * [Jim and the Orders](https://www.hackerrank.com/challenges/jim-and-the-orders/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JimAndTheOrders {
	public static void main(String[] args) {
		Map<Integer, Integer> hmap = new LinkedHashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			int key = i;
			int value = sc.nextInt() + sc.nextInt();
			hmap.put(key, value);
		}

		Set<Entry<Integer, Integer>> set = hmap.entrySet();
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(set);
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
				return e1.getValue().compareTo(e2.getValue());
			}
		});

		for (Entry<Integer, Integer> i : list) {
			System.out.print(i.getKey() + " ");
		}
		sc.close();
	}
}
