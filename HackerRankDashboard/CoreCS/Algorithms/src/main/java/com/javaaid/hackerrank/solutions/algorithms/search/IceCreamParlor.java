/**
 * 
 * Problem Statement-
 * [Ice Cream Parlor](https://www.hackerrank.com/challenges/icecream-parlor/problem) 
 * [Tutorial](https://youtu.be/7sEHjHef2zo)
 */
package com.javaaid.hackerrank.solutions.algorithms.search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class IceCreamParlor {

	// approach1- using hashmap
	static int[] icecreamParlorA1(int m, int[] arr) {
		int result[] = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			int y = m - x;
			Integer j = map.get(y);
			if (j != null) {
				result[0] = j + 1;
				result[1] = i + 1;
				break;
			}
			map.put(x, i);

		}
		return result;
	}

	// approach2 - using array
	static int[] icecreamParlorA2(int m, int[] arr) {
		int result[] = new int[2];
		int n = arr.length;
		int frequency[] = new int[10001];

		Arrays.fill(frequency, -1);

		for (int i = 0; i < n; i++) {
			int x = arr[i];
			int y = m - x;

			if (y >= 0) {

				int j = frequency[y];

				if (j != -1) {
					result[0] = j + 1;
					result[1] = i + 1;
					break;
				}
			}

			frequency[x] = i;
		}

		return result;

	}

	// approach3- editorial approach
	static int[] icecreamParlorA3(int m, int[] arr) {
		int result[] = new int[2];
		int n = arr.length;
		int frequency[] = new int[10001];
		int firstFlavourIndex = 0;
		int secondFlavourIndexStartsFrom = 0;
		int secondFlavourCost = 0;

		for (int i = 0; i < n; i++) {
			int priceIndex = arr[i];
			frequency[priceIndex]++;
		}

		for (int i = 0; i < n; i++) {
			int firstFlavourCost = arr[i];
			frequency[firstFlavourCost]--;

			secondFlavourCost = m - firstFlavourCost;

			if (secondFlavourCost > 0 && frequency[secondFlavourCost] > 0) {
				firstFlavourIndex = i;
				secondFlavourIndexStartsFrom = firstFlavourIndex + 1;
				result[0] = firstFlavourIndex + 1;
				break;
			}

		}

		for (int i = secondFlavourIndexStartsFrom; i < n; i++) {
			if (arr[i] == secondFlavourCost) {
				result[1] = i + 1;
				break;
			}
		}

		return result;
	}

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

			int result[] = icecreamParlorA1(m, a);
			System.out.println(result[0] + " " + result[1]);
		}
		sc.close();
	}
}
