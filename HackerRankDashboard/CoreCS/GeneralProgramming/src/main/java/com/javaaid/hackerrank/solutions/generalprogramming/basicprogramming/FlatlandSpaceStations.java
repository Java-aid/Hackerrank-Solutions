/**
 * 
 * Problem Statement-
 * [Flatland Space Stations](https://www.hackerrank.com/challenges/flatland-space-stations/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class FlatlandSpaceStations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean spaceStations[] = new boolean[n];
		for (int i = 0; i < m; i++) {
			int index = sc.nextInt();
			spaceStations[index] = true;
		}
		int result = getFlatLandStations(spaceStations);
		System.out.println(n == m ? 0 : result);
		sc.close();
	}

	/**
	 * 
	 * 
	 */
	private static int getFlatLandStations(boolean[] spaceStations) {
		int n = spaceStations.length;
		int maxDistance = 0;
		int start = 0, end = n - 1, distance = 0;
		boolean firstFound = false;
		for (int i = 0; i < n; i++) {
			if (spaceStations[i]) {
				if (!firstFound) {
					maxDistance = Math.abs(start - i);
					firstFound = true;
					start = i;
				} else {
					distance = Math.abs(i - start) / 2;
					start = i;
				}
				maxDistance = Math.max(distance, maxDistance);
			}
		}
		if (end - start > 1) {
			distance = Math.abs(start - end);
		}
		maxDistance = Math.max(distance, maxDistance);
		return maxDistance;
	}
}