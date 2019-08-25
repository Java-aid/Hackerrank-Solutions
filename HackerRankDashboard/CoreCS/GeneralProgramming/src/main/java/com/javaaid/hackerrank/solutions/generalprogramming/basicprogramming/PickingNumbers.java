/**
 * 
 * Problem Statement-
 * [Picking Numbers](https://www.hackerrank.com/challenges/picking-numbers/problem) 
 * [Tutorial](https://youtu.be/PtFAJTCKNn8)
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Kanahaiya Gupta
 *
 */
public class PickingNumbers {

	public static int pickingNumbers(List<Integer> a) {
		int frequency[] = new int[101];
		int result = Integer.MIN_VALUE;

		for (int i = 0; i < a.size(); i++) {
			int index=a.get(i);
			frequency[index]++; //frequency[index]=frequency[index]+1
		}

		for (int i = 1; i <= 100; i++) {
			result = Math.max(result, frequency[i] + frequency[i - 1]);
		}
		return result;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		while (n-- > 0) {
			list.add(sc.nextInt());
		}

		int result = pickingNumbers(list);
		System.out.println(result);
		sc.close();

	}
}
