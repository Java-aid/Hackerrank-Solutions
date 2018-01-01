/**
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class SockMerchant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		int M = sc.nextInt();
		int a[] = new int[M];
		int count = 0;
		for (int i = 0; i < M; i++) {
			int temp = sc.nextInt();
			if (set.contains(temp)) {
				set.remove(temp);
				count++;
			} else {
				set.add(temp);
			}

		}
		System.out.println(count);
		sc.close();
	}
}