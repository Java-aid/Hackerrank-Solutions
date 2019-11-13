/**
 * 
 * Problem Statement-
 * [Sparse Arrays](https://www.hackerrank.com/challenges/sparse-arrays/problem)    
 * [Tutorial](https://youtu.be/BZdnvTBO4vI)
 */
package com.javaaid.hackerrank.solutions.datastructures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class SparseArrays {

	static int[] matchingStrings(String[] strings, String[] queries) {
		Map<String, Integer> map = new HashMap<>();
		int result[] = new int[queries.length];

		for (int i = 0; i < strings.length; i++) {
			String inputString = strings[i];
			if (map.containsKey(inputString)) {
				map.put(inputString, map.get(inputString) + 1);
			} else {
				map.put(inputString, 1);
			}
		}

		for (int i = 0; i < queries.length; i++) {
			String queryString = queries[i];
			if (map.containsKey(queryString)) {
				result[i] = map.get(queryString);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfStrings = sc.nextInt();

		String str[] = new String[noOfStrings];

		for (int i = 0; i < noOfStrings; i++) {
			str[i] = sc.next();
		}
		int queries = sc.nextInt();
		String strQ[] = new String[queries];

		for (int i = 0; i < queries; i++) {
			strQ[i] = sc.next();
		}
		int[] counter = matchingStrings(str, strQ);
		System.out.println(Arrays.toString(counter));
		sc.close();
	}

}