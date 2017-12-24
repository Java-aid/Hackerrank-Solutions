/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JavaList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> L = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			L.add(sc.nextInt());
		}
		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			String op = sc.next();
			if (op.equalsIgnoreCase("INSERT")) {
				int index = sc.nextInt();
				int item = sc.nextInt();
				L.add(index, item);
			} else {
				L.remove(sc.nextInt());
			}

		}
		for (Integer integer : L) {
			System.out.print(integer + " ");
		}
		sc.close();
	}
}
