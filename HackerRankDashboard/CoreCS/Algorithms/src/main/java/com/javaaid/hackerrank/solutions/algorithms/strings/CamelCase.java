/**
 * 
 * Problem Statement-
 * [CamelCase](https://www.hackerrank.com/challenges/camelcase/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.strings;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class CamelCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();

	}
}
