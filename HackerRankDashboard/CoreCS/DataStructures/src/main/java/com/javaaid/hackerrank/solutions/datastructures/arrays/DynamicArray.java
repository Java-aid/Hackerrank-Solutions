/**
 * 
 * Problem Statement-
 * [Dynamic Array](https://www.hackerrank.com/challenges/dynamic-array)  
 * [Tutorial](https://youtu.be/N0lSGQrya6s)
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

	List<Integer> seq = new ArrayList<Integer>();
	List<List<Integer>> seqList = new ArrayList<List<Integer>>();
	int lastAns = 0;

	public DynamicArray(int N) {
		for (int i = 0; i < N; i++) {
			seq = new ArrayList<Integer>();
			seqList.add(seq);
		}
	}

	void appendValue(int x, int y, int N) {
		int rowIndex = (x ^ lastAns) % N;
		List<Integer> seq = seqList.get(rowIndex);
		seq.add(y);
	}

	private void printValue(int x, int y, int N) {
		int colIndex = 0;
		int rowIndex = (x ^ lastAns) % N;
		List<Integer> seq = seqList.get(rowIndex);
		colIndex = y % seq.size();
		lastAns = seq.get(colIndex);
		System.out.println(lastAns);
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
				da.appendValue(x, y, N);
			} else {
				da.printValue(x, y, N);
			}

		}
		sc.close();
	}

}
