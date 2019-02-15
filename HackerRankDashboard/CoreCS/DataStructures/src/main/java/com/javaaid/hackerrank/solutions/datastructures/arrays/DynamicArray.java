/**
 * 
 * Problem Statement-
 * [Dynamic Array](https://www.hackerrank.com/challenges/dynamic-array)  
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Kanahaiya Gupta
 *
 */
public class DynamicArray {

	List<Integer> list = new ArrayList<Integer>();
	List<List<Integer>> seqList = new ArrayList<List<Integer>>();
	int lastAns;

	public DynamicArray(int N) {
		for (int i = 0; i < N; i++) {
			list = new ArrayList<Integer>();
			seqList.add(list);
		}
	}

	void putValue(int x, int y, int N) {
		int rowIndex = (x ^ lastAns) % N;
		seqList.get(rowIndex).add(y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		DynamicArray da = new DynamicArray(N);
		for (int i = 0; i < Q; i++) {
			int queryType = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (queryType == 1) {
				da.putValue(x, y, N);
			} else {
				da.getValue(x, y, N);
			}

		}
		sc.close();
	}

	private void getValue(int x, int y, int N) {
		int colIndex = 0;
		int rowIndex = (x ^ lastAns) % N;
		colIndex = y % seqList.get(rowIndex).size();
		lastAns = seqList.get(rowIndex).get(colIndex);
		System.out.println(lastAns);
	}

}
