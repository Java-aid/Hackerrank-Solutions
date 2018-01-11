/**
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class FindDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			String tmp = sc.next();
			for (int j = 0; j < tmp.length(); j++) {
				int digit = tmp.charAt(j) - '0';
				if (digit != 0 && Integer.parseInt(tmp) % digit == 0) {
					count++;
				}
			}
			System.out.println(count);
			count = 0;
		}
		sc.close();
	}
}
