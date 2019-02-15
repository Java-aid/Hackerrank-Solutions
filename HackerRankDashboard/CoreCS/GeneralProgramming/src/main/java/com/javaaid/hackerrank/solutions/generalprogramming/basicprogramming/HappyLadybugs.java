/**
 * 
 * Problem Statement-
 * [Happy Ladybugs](https://www.hackerrank.com/challenges/happy-ladybugs/problem)  
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
public class HappyLadybugs {
	public static void main(String[] args) {
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		for (int i = 0; i < g; i++) {
			int n = sc.nextInt();
			String b = sc.next();
			hmap.put(b.charAt(0), 1);
			boolean needAdjust = false;
			for (int j = 1; j < b.length(); j++) {
				char ch = b.charAt(j);
				if (hmap.containsKey(ch)) {

					if ((j == b.length() - 1 && b.charAt(j) != b.charAt(j - 1))
							|| b.charAt(j) != b.charAt(j - 1) && ((b.charAt(j) != b.charAt(j + 1)))) {
						needAdjust = true;
					}
					hmap.put(ch, hmap.get(ch) + 1);
				} else {
					hmap.put(ch, 1);
				}

			}
			boolean found = false;
			Set<Entry<Character, Integer>> s = hmap.entrySet();
			for (Entry<Character, Integer> entry : s) {
				int value = entry.getValue();
				char key = entry.getKey();
				if (value == 1 && key != '_') {
					System.out.println("NO");
					found = true;
					break;
				} else if (needAdjust && !hmap.containsKey('_')) {
					System.out.println("NO");
					found = true;
					break;
				}
			}
			if (!found)
				System.out.println("YES");
			hmap.clear();
		}
		sc.close();
	}
}
