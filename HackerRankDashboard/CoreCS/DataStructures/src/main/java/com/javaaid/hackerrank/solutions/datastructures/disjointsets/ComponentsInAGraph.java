/**
 * 
 * Problem Statement-
 * [Components in a graph](https://www.hackerrank.com/challenges/find-the-running-median)   
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.disjointsets;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class ComponentsInAGraph {

	int[] id, sz;
	int count;

	ComponentsInAGraph(int n) {
		id = new int[n];
		sz = new int[n];
		count = n;
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
			sz[i] = 1;
		}

	}

	public int getCount() {
		return count;
	}

	public void decrementCount() {
		count--;
	}

	public boolean connected(int p, int q) {
		return id[p] == id[q];

	}

	public void union(int p, int q) {
		int pId = id[p];
		int qId = id[q];

		if (pId == qId) {
			return;
		} else {
			for (int i = 0; i < id.length; i++) {
				if (id[i] == pId)
					id[i] = qId;

			}
		}
		this.decrementCount();
	}

	public void printMinMax(int[] a) {
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {

			if (hmap.containsKey(a[i])) {
				hmap.put(a[i], hmap.get(a[i]) + 1);
			} else {
				hmap.put(a[i], 1);
			}

		}
		int min = Integer.MAX_VALUE, max = 0;
		for (Map.Entry<Integer, Integer> e : hmap.entrySet()) {
			if ((e.getValue()) > 1) {
				int temp = e.getValue();
				if (temp > max) {
					max = temp;
				}
				if (temp < min) {
					min = temp;
				}
			}
		}
		System.out.println(min + " " + max);
	}

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ComponentsInAGraph c = new ComponentsInAGraph(2 * N + 1);
		while (N-- != 0) {
			int p = sc.nextInt();
			int q = sc.nextInt();

			if (!c.connected(p, q)) {
				c.union(p, q);
			}

		}
		c.printMinMax(c.id);
		sc.close();
	}

}
