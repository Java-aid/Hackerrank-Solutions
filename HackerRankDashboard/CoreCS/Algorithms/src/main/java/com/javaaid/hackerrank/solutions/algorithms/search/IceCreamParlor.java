/**
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.search;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class IceCreamParlor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = sc.nextInt();
			}

			for (int j = 0; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (m == a[j] + a[k]) {
						if (j > k) {
							System.out.println(++k + " " + ++j);
						} else {
							System.out.println(++j + " " + ++k);
						}
						break;
					}

				}
			}
		}
		sc.close();
	}
}
