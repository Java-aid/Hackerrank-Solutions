/**
 * 
 * Problem Statement-
 * [Prim's (MST) : Special Subtree](https://www.hackerrank.com/challenges/primsmstsub/problem)    
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.graphtheory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */

public class PrimsMSTSpecialSubtree {

	static class EdgeWeightedGraph {
		private final int V;
		private int E;
		private final ArrayList<Edge>[] adj;

		@SuppressWarnings("unchecked")
		public EdgeWeightedGraph(int V) {
			super();
			this.V = V;
			this.E = 0;
			this.adj = (ArrayList<Edge>[]) new ArrayList[V + 1];
			for (int v = 1; v <= V; v++)
				adj[v] = new ArrayList<Edge>();
		}

		public EdgeWeightedGraph(Scanner sc) {
			this(sc.nextInt());
			int E = sc.nextInt();
			for (int i = 0; i < E; i++) {
				int v = sc.nextInt();
				int w = sc.nextInt();
				double weight = sc.nextDouble();
				Edge e = new Edge(v, w, weight);
				addEdge(e);
			}
		}

		public void addEdge(Edge e) {
			int v = e.either();
			int w = e.other(v);
			adj[v].add(e);
			adj[w].add(e);
			E++;
		}

		public Iterable<Edge> adj(int v) {
			return adj[v];
		}

		public int V() {
			return V;
		}

		public Iterable<Edge> edges() {
			ArrayList<Edge> edges = new ArrayList<Edge>();
			for (int v = 1; v <= V; v++) {
				for (Edge e : adj[v]) {
					if (e.other(v) > v)
						edges.add(e);
				}
			}
			return edges;
		}

		@Override
		public String toString() {
			StringBuilder s = new StringBuilder();
			s.append(V + " " + E + "\n");
			for (int v = 0; v < V; v++) {
				s.append(v + ":");
				for (Edge e : adj[v]) {
					s.append(e + " ");
				}
				s.append("\n");
			}
			return s.toString();
		}

	}

	static class Edge implements Comparable<Edge> {
		private final int v, w;
		private final double weight;

		public Edge(int v, int w, double weight) {
			super();
			this.v = v;
			this.w = w;
			this.weight = weight;
		}

		public int either() {
			return v;
		}

		public int other(int vertex) {
			if (vertex == v)
				return w;
			return v;
		}

		public int compareTo(Edge that) {
			if (this.weight > that.weight)
				return 1;
			if (this.weight < that.weight)
				return -1;
			return 0;
		}

		public double weight() {
			return weight;
		}

		@Override
		public String toString() {
			return String.format("%d-%d %.5f", v, w, weight);
		}

	}

	static class LazyPrimMST {

		private boolean[] marked;
		private Queue<Edge> mst;
		private PriorityQueue<Edge> pq;
		private double weight;

		public LazyPrimMST(EdgeWeightedGraph G) {
			super();
			pq = new PriorityQueue<Edge>();
			mst = new LinkedList<Edge>();
			marked = new boolean[G.V() + 1];
			for (int v = 1; v <= G.V(); v++)
				if (!marked[v])
					prim(G, v);

		}

		/**
		 * @param g
		 * @param v
		 */
		private void prim(EdgeWeightedGraph G, int s) {
			scan(G, s);
			while (!pq.isEmpty()) {
				Edge e = pq.poll();
				int v = e.either();
				int w = e.other(v);
				if (marked[v] && marked[w])
					continue;
				mst.add(e);
				weight += e.weight();
				if (!marked[v])
					scan(G, v);
				if (!marked[w])
					scan(G, w);
			}

		}

		/**
		 * @param g
		 * @param s
		 */
		private void scan(EdgeWeightedGraph G, int v) {
			marked[v] = true;
			for (Edge e : G.adj(v))
				if (!marked[e.other(v)])
					pq.add(e);

		}

		public Iterable<Edge> edges() {
			return mst;
		}

		public double weight() {
			return weight;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EdgeWeightedGraph G = new EdgeWeightedGraph(sc);
		LazyPrimMST mst = new LazyPrimMST(G);
		System.out.println((int) mst.weight());
	}
}
