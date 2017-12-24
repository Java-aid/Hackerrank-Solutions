/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JavaSubstringComparisons {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		String s = sc.next();
		int k = sc.nextInt();
		for (int i = 0; i <= s.length() - k; i++) {
			String tmp = s.substring(i, k + i);
			list.add(tmp);
		}
		Collections.sort(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));
		sc.close();
	}
}
