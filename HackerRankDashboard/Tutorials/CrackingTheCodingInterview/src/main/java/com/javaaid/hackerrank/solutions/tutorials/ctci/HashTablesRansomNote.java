/**
 * 
 * Problem Statement-
 * [Hash Tables: Ransom Note](https://www.hackerrank.com/challenges/ctci-ransom-note/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.tutorials.ctci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class HashTablesRansomNote {

	public static boolean isMessageReplicable(String[] magazine, String[] ransom) {
		Map<String, Integer> magazineWords = new HashMap<String, Integer>();

		for (int i = 0; i < magazine.length; i++) {
			Integer wordCount = magazineWords.get(magazine[i]);
			if (wordCount == null) {
				magazineWords.put(magazine[i], 1);
			} else {
				magazineWords.put(magazine[i], wordCount + 1);
			}
		}

		for (int i = 0; i < ransom.length; i++) {
			Integer wordCount = magazineWords.get(ransom[i]);
			if (wordCount == null || wordCount == 0) {
				return false;
			} else {
				magazineWords.put(ransom[i], wordCount - 1);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		String magazine[] = new String[m];
		for (int magazine_i = 0; magazine_i < m; magazine_i++) {
			magazine[magazine_i] = in.next();
		}
		String ransom[] = new String[n];
		for (int ransom_i = 0; ransom_i < n; ransom_i++) {
			ransom[ransom_i] = in.next();
		}
		String result = isMessageReplicable(magazine, ransom) ? "Yes" : "No";
		System.out.println(result);
		in.close();
	}
}
