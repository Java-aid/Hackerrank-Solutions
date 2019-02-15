/**
 * 
 * Problem Statement-
 * [Sparse Arrays](https://www.hackerrank.com/challenges/sparse-arrays/problem)    
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.arrays;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class SparseArrays {
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
		int counter = 0;
		for (int i = 0; i < queries; i++) {
			for (int j = 0; j < noOfStrings; j++) {
				if (str[j].equals(strQ[i])) {
					counter++;
				}
			}
			System.out.println(counter);
			counter = 0;
		}
		sc.close();
	}

}