/**
 * 
 * Problem Statement-
 * [Breaking the Records](https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem)           
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class BreakingTheRecords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] score = new int[n];
		int baseScore = in.nextInt();
		int bestScoreCount = 0, leastScoreCount = 0;
		int baseBestScore = baseScore, baseLeastScore = baseScore;
		for (int score_i = 1; score_i < n; score_i++) {
			score[score_i] = in.nextInt();
			if (score[score_i] < baseLeastScore) {
				baseLeastScore = score[score_i];
				leastScoreCount++;
			}
			if (score[score_i] > baseBestScore) {
				baseBestScore = score[score_i];
				bestScoreCount++;
			}
		}
		System.out.println(bestScoreCount + " " + leastScoreCount);
		in.close();
	}
}
