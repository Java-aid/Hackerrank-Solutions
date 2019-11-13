/**
 * 
 * Problem Statement-
 * [Sherlock and the Valid String](https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Kanahaiya Gupta
 *
 */
public class SherlockAndTheValidString {
	static String isValid(String s) {
		int a[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			a[index]++;
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < 26; i++) {
			if (a[i] != 0) {
				if (map.containsKey(a[i])) {
					map.put(a[i], map.get(a[i]) + 1);
				} else {
					map.put(a[i], 1);
				}
			}
		}
		if (map.size() == 1)
			return "YES";
		if (map.size() == 2) {
			Set<Entry<Integer, Integer>> entrySet = map.entrySet();
			Iterator it = entrySet.iterator();
			Entry<Integer, Integer> e1 = (Entry<Integer, Integer>) it.next();
			int key1 = e1.getKey();
			int value1 = e1.getValue();
			Entry<Integer, Integer> e2 = (Entry<Integer, Integer>) it.next();
			int key2 = e2.getKey();
			int value2 = e2.getValue();
			if (value1 == 1 || value2 == 1 && Math.abs(key1 - key2) == 1)
				return "YES";
		}
		return "NO";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = isValid(s);
		System.out.println(result);
	}
}
