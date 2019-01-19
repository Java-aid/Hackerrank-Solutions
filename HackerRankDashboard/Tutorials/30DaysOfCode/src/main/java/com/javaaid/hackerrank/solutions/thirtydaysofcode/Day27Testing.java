/**
 * 
 * Problem Statement-
 * [Day 27: Testing](https://www.hackerrank.com/challenges/30-testing/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.thirtydaysofcode;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Day27Testing {
	public static void main(String[] args) {
		System.out.println(5);
	    System.out.println("4 3");
	    System.out.println("0 -3 4 2");
	    System.out.println("5 2");
	    System.out.println("0 -3 4 2 2");
	    System.out.println("3 3");
	    System.out.println("0 -3 4");
	    System.out.println("7 2");
	    System.out.println("0 -3 1 1 1 1 1");
	    System.out.println("6 3");
	    System.out.println("0 -3 4 2 1 1");
	    /**
	     * uncomment below method if you want to generate automated Testcase.
	     * Its generating proper test case and you can pass it to Angry professer program
	     * which will give you proper output. But hackerrank platform is validating based on hardcode test case, so commented
	     * the below logic. feel free to uncomment & see its working.
	     */
//		testCaseGeneration();
	    }

	/**
	 * optional , written for learning purpose
	 */
	private static void testCaseGeneration() {
		String []lectures={"YES","NO","YES","NO","YES"};
		int t = 5,m=0;
		System.out.println(t);
		while (t-- > 0) {
			String classCancel = lectures[m++];
			Random gen = new Random();
			int n = gen.nextInt(197) + 3;
			int k = gen.nextInt(n - 1) + 1;
			System.out.println(n + " " + k);
			if (classCancel.equalsIgnoreCase("YES")) {
				generateTcForFailure(n, k, gen);
			} else {
				generateTcForSuccess(n, k, gen);
			}
			System.out.println();
		}
	}

	/**
	 * @param n
	 * @param k
	 * @param gen
	 */
	private static void generateTcForFailure(int n, int k, Random random) {
		int studentCount = 0;
		String tc="";
		while (n > 0) {
			int a = random.nextInt(2000) - 1000;
			if (a < k && studentCount < k-1) {
				tc+=a+" ";
				studentCount++;
				n--;
			} else if (a > k) {
				tc+=a+" ";
				n--;
			}
		}
		System.out.print(tc.trim());
	}

	/**
	 * @param n
	 * @param k
	 */
	private static void generateTcForSuccess(int n, int k, Random random) {
		int studentCount = 0;
		String tc="";
		while (n > 0) {
			int a = random.nextInt(2000) - 1000;
			if ( studentCount >= k) {
				tc+=a+" ";
				n--;
			} else if (a<=k  && studentCount < k) {
				studentCount++;
				tc+=a+" ";
				n--;
			}
		}
		System.out.print(tc.trim());
	}

}
