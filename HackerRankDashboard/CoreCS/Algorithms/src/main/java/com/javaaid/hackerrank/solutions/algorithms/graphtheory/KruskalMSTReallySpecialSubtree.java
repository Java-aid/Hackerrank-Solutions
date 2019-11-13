/**
 * 
 * Problem Statement-
 * [Kruskal (MST): Really Special Subtree](https://www.hackerrank.com/challenges/kruskalmstrsub/problem) 
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
public class KruskalMSTReallySpecialSubtree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EdgeWeightedGraph G = new EdgeWeightedGraph(sc);
		KruskalMST kmst = new KruskalMST(G);
		System.out.println((int) kmst.weight());
	}
}

class KruskalMST {

	private Queue<Edge> mst;
	private double weight;

	public KruskalMST(EdgeWeightedGraph G) {
		mst = new LinkedList<Edge>();
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		for (Edge e : G.edges()) {
			pq.add(e);
		}
		UF uf = new UF(G.V());
		while (!pq.isEmpty() && mst.size() < G.V() - 1) {
			Edge e = pq.poll();
			int v = e.either();
			int w = e.other(v);
			if (uf.connected(v, w))
				continue;
			uf.union(v, w);
			mst.add(e);
			weight += e.weight();
		}
	}

	public Iterable<Edge> edges() {
		return mst;
	}

	public double weight() {
		return weight;
	}
}

class EdgeWeightedGraph {
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

class Edge implements Comparable<Edge> {
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

class UF {
	int[] id;
	int count;

	public UF(int N) {
		super();
		count = N;
		id = new int[N + 1];
		for (int i = 1; i <= N; i++)
			id[i] = i;
	}

	public int count() {
		return count;
	}

	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}

	private int find(int p) {
		return id[p];
	}

	public void union(int p, int q) {
		int pId = find(p);
		int qId = find(q);

		if (pId == qId)
			return;

		for (int i = 0; i < id.length; i++)
			if (id[i] == pId)
				id[i] = qId;
		count--;
	}
}
