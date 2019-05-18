/**
 * 
 * Problem Statement-
 * [Strings: Making Anagrams](https://www.hackerrank.com/challenges/ctci-making-anagrams/problem)    
 * 
 */
package org.javaaid.hackerrank.solutions.implementation.bruteforce;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class StringsMakingAnagrams {
	public static int numberNeeded(String first, String second) {
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		int length = 0;
		for (int i = 0; i < first.length(); i++) {
			char c = first.charAt(i);
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);
			} else {
				hmap.put(c, 1);
			}
		}

		for (int i = 0; i < second.length(); i++) {
			char c = second.charAt(i);
			if (hmap.containsKey(c) && hmap.get(c) != 0) {
				hmap.put(c, hmap.get(c) - 1);
				length += 2;
			}
		}
		return (first.length() + second.length() - length);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		in.close();
		System.out.println(numberNeeded(a, b));
	}
}
