/**
 * 
 * Problem Statement-
 * [Heaps: Find the Running Median](https://www.hackerrank.com/challenges/ctci-find-the-running-median/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.tutorials.ctci;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class HeapsFindTheRunningMedian {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> highers = new PriorityQueue<Integer>();
		PriorityQueue<Integer> lowers = new PriorityQueue<Integer>(new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i2.compareTo(i1);
			}
		});
		int N = sc.nextInt();
		double meadian = 0;
		for (int i = 1; i <= N; i++) {
			int number = sc.nextInt();
			addNumber(number, lowers, highers);
			rebalance(lowers, highers);
			meadian = getMedian(lowers, highers);
			System.out.println(meadian);
			sc.close();
		}
	}

	private static double getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
		PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
		PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;
		if (biggerHeap.size() == smallerHeap.size()) {
			return ((double) (biggerHeap.peek() + smallerHeap.peek())) / 2d;
		} else {
			return biggerHeap.peek();
		}
	}

	private static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
		PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
		PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;
		if (biggerHeap.size() - smallerHeap.size() >= 2) {
			smallerHeap.add(biggerHeap.poll());
		}
	}

	private static void addNumber(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
		if (lowers.size() == 0 || number < lowers.peek()) {
			lowers.add(number);
		} else {
			highers.add(number);
		}

	}

}
