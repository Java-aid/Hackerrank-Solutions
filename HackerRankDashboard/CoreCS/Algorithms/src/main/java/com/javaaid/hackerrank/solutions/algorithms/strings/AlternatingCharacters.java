/**
 * 
 * Problem Statement-
 * [Alternating Characters](https://www.hackerrank.com/challenges/alternating-characters/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.strings;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class AlternatingCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String tmp = sc.next();
			int count = 0;
			for (int j = 1; j < tmp.length(); j++) {
				if (tmp.charAt(j - 1) == tmp.charAt(j)) {
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}
