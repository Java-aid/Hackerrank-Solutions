/**
 * 
 * Problem Statement-
 * [Compare the Triplets](https://www.hackerrank.com/challenges/compare-the-triplets/problem)    
 * [Tutorial]([Tutorial](https://youtu.be/rFUZAtwXiII) 
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class CompareTheTriplets {

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int aliceTotalScore = 0, bobTotalScore = 0;

		for (int i = 0; i < 3; i++) {
			int aliceScore = a.get(i);
			int bobScore = b.get(i);
			if (aliceScore != bobScore) {
				int temp = aliceScore > bobScore ? aliceTotalScore++ : bobTotalScore++;
			}

		}
		List<Integer> result = new ArrayList<>();
		result.add(aliceTotalScore);
		result.add(bobTotalScore);
		return result;
	}

}
