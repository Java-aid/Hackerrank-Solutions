/**
 * 
 * Problem Statement-
 * [Count Triplets](https://www.hackerrank.com/challenges/count-triplets-1/problem) 
 * [Tutorial](https://youtu.be/tBFZMaWP0W8)
 * 
 */
package com.javaaid.dictionaries;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CountTriplets {

	private static long countTriplets(List<Long> arr, long r) {
		Map<Long, Long> leftMap = new HashMap<>();
		Map<Long, Long> rightMap = new HashMap<>();

		for (long item : arr) {
			rightMap.put(item, rightMap.getOrDefault(item, 0L) + 1);
		}

		long count = 0;

		for (int i = 0; i < arr.size(); i++) {
			long midTerm = arr.get(i);
			long c1 = 0, c3 = 0;

			rightMap.put(midTerm, rightMap.getOrDefault(midTerm, 0L) - 1);

			if (leftMap.containsKey(midTerm / r) && midTerm % r == 0) {
				c1 = leftMap.get(midTerm / r);
			}

			if (rightMap.containsKey(midTerm * r))
				c3 = rightMap.get(midTerm * r);

			count += c1 * c3;

			leftMap.put(midTerm, leftMap.getOrDefault(midTerm, 0L) + 1);

		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long r = sc.nextLong();
		List<Long> arr = new ArrayList<>();
		while (n-- > 0) {
			arr.add(sc.nextLong());
		}

		long ans = countTriplets(arr, r);
		System.out.println(ans);

		sc.close();
	}
}
