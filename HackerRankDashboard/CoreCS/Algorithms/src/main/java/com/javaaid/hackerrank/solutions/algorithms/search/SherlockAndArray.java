/**
 * 
 * Problem Statement-
 * [Sherlock and Array](https://www.hackerrank.com/challenges/sherlock-and-array/problem)
 * [Tutorial](https://youtu.be/xPHJH8RL3mo)
 */
package com.javaaid.hackerrank.solutions.algorithms.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SherlockAndArray {

	static String balancedSums(List<Integer> arr) {
		int x = 0;
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}

		for (int y : arr) {
			if (2 * x == sum - y) {
				return "YES";
			}
			x = x + y;
		}
		return "NO";

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			List<Integer> list = new ArrayList();
			for (int i = 0; i < n; i++) {
				list.add(sc.nextInt());
			}
			System.out.println(balancedSums(list));
		}
		sc.close();
	}

}
