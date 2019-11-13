/**
 * 
 * Problem Statement-
 * [BFS: Shortest Reach in a Graph](https://www.hackerrank.com/challenges/ctci-bfs-shortest-reach/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.tutorials.ctci;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Kanahaiya Gupta
 *
 */

class Graph {

	private final int V;
	private int E;
	private ArrayList<Integer>[] adj;

	Graph(int V) {
		adj = (ArrayList<Integer>[]) new ArrayList[V + 1];
		this.V = V;
		this.E = 0;
		for (int v = 1; v <= V; v++)
			adj[v] = new ArrayList<Integer>(V);
	}

	Graph(Scanner in) {
		this(in.nextInt());
		int E = in.nextInt();
		for (int i = 0; i < E; i++) {
			int v = in.nextInt();
			int w = in.nextInt();
			addEdge(v, w);
		}
	}

	public int V() {
		return V;
	}

	public int E() {
		return E;
	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
		E++;
	}

	public Iterable<Integer> adj(int v) {
		return adj[v];
	}

}

class BreadthFirstPaths {
	private int s;
	private boolean marked[];
	private int edgeTo[];

	BreadthFirstPaths(Graph G, int s) {
		marked = new boolean[G.V() + 1];
		this.s = s;
		edgeTo = new int[G.V() + 1];
		bfs(G, s);
	}

	private void bfs(Graph G, int s) {
		Queue<Integer> q = (Queue<Integer>) new LinkedList<Integer>();
		q.add(s);
		while (!q.isEmpty()) {
			int v = q.poll();
			marked[v] = true;
			for (int w : G.adj(v)) {
				if (!marked[w]) {
					marked[w] = true;
					edgeTo[w] = v;
					q.add(w);
				}
			}
		}

	}

	public Iterable<Integer> pathTo(int v) {
		if (!hasPathTo(v))
			return null;
		Stack<Integer> path = new Stack<Integer>();
		for (int x = v; x != s; x = edgeTo[x])
			path.push(x);
		path.push(s);
		return path;

	}

	public boolean hasPathTo(int v) {
		return marked[v];
	}

}

public class BFSShortestReachInAGraph {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			Graph G = new Graph(sc);
			int s = sc.nextInt();
			BreadthFirstPaths bfp = new BreadthFirstPaths(G, s);
			for (int v = 1; v <= G.V(); v++) {
				if (s != v) {
					if (bfp.hasPathTo(v)) {
						Stack<Integer> st = (Stack<Integer>) bfp.pathTo(v);
						int sum = 0;
						for (int x = 1; x < st.size(); x++) {
							sum += 6;
						}
						System.out.print(sum + " ");

					} else {
						System.out.print(-1 + " ");
					}
				}
			}
			System.out.println();
			sc.close();
		}
	}

}
