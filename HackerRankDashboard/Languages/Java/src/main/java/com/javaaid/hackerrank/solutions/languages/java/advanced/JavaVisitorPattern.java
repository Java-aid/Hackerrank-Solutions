/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.advanced;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */

enum Color {
	RED, GREEN
}

abstract class Tree {

	private int value;
	private Color color;
	private int depth;

	public Tree(int value, Color color, int depth) {
		this.value = value;
		this.color = color;
		this.depth = depth;
	}

	public int getValue() {
		return value;
	}

	public Color getColor() {
		return color;
	}

	public int getDepth() {
		return depth;
	}

	public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

	private ArrayList<Tree> children = new ArrayList<>();

	public TreeNode(int value, Color color, int depth) {
		super(value, color, depth);
	}

	public void accept(TreeVis visitor) {
		visitor.visitNode(this);

		for (Tree child : children) {
			child.accept(visitor);
		}
	}

	public void addChild(Tree child) {
		children.add(child);
	}
}

class TreeLeaf extends Tree {

	public TreeLeaf(int value, Color color, int depth) {
		super(value, color, depth);
	}

	public void accept(TreeVis visitor) {
		visitor.visitLeaf(this);
	}
}

abstract class TreeVis {
	public abstract int getResult();

	public abstract void visitNode(TreeNode node);

	public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
	private int result = 0;

	public int getResult() {
		return result;
	}

	public void visitNode(TreeNode node) {
		// do nothing
	}

	public void visitLeaf(TreeLeaf leaf) {
		result += leaf.getValue();
	}
}

class ProductOfRedNodesVisitor extends TreeVis {
	private long result = 1;
	private final int M = 1000000007;

	public int getResult() {
		return (int) result;
	}

	public void visitNode(TreeNode node) {
		if (node.getColor() == Color.RED) {
			result = (result * node.getValue()) % M;
		}
	}

	public void visitLeaf(TreeLeaf leaf) {
		if (leaf.getColor() == Color.RED) {
			result = (result * leaf.getValue()) % M;
		}
	}
}

class FancyVisitor extends TreeVis {
	private int nonLeafEvenDepthSum = 0;
	private int greenLeavesSum = 0;

	public int getResult() {
		return Math.abs(nonLeafEvenDepthSum - greenLeavesSum);
	}

	public void visitNode(TreeNode node) {
		if (node.getDepth() % 2 == 0) {
			nonLeafEvenDepthSum += node.getValue();
		}
	}

	public void visitLeaf(TreeLeaf leaf) {
		if (leaf.getColor() == Color.GREEN) {
			greenLeavesSum += leaf.getValue();
		}
	}
}

public class JavaVisitorPattern {
	static int[] values;
	static Color[] colors;
	static ArrayList<Integer>[] edges;
	// each edges[i] holds arrayList of all nodes connnected to node i

	@SuppressWarnings("unchecked")
	public static Tree solve() {
		int n;
		TreeNode root;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		values = new int[n];
		colors = new Color[n];
		for (int i = 0; i < n; i++)
			values[i] = sc.nextInt();
		for (int i = 0; i < n; i++)
			colors[i] = sc.nextInt() == 0 ? Color.RED : Color.GREEN;

		// initialize arraylists
		edges = (ArrayList<Integer>[]) new ArrayList[n + 1];
		for (int i = 1; i <= n; i++)
			edges[i] = new ArrayList<Integer>();

		// read the n- 1 edges and store them in both directions
		for (int i = 0; i < n - 1; i++) {
			int edgeNode1 = sc.nextInt();
			int edgeNode2 = sc.nextInt();
			edges[edgeNode1].add(edgeNode2);
			edges[edgeNode2].add(edgeNode1);
		}
		sc.close();
		root = new TreeNode(values[0], colors[0], 0); // root is always internal
		addChildren(root, 1);
		return root;
	}

	public static void addChildren(Tree node, Integer nodeNumber) {
		// for all edges coming out of this node
		for (Integer otherNodeNumber : edges[nodeNumber]) {
			Tree otherNode;
			if (edges[otherNodeNumber].size() > 1)
				// new internal node
				otherNode = new TreeNode(values[otherNodeNumber - 1], colors[otherNodeNumber - 1], node.getDepth() + 1);
			else
				// new leaf
				otherNode = new TreeLeaf(values[otherNodeNumber - 1], colors[otherNodeNumber - 1], node.getDepth() + 1);
			((TreeNode) node).addChild(otherNode);
			edges[otherNodeNumber].remove(nodeNumber); // remove reverse edge
			if (otherNode instanceof TreeNode)
				addChildren(otherNode, otherNodeNumber);
		}
	}

	public static void main(String[] args) {
		Tree root = solve();
		SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
		ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
		FancyVisitor vis3 = new FancyVisitor();

		root.accept(vis1);
		root.accept(vis2);
		root.accept(vis3);

		int res1 = vis1.getResult();
		int res2 = vis2.getResult();
		int res3 = vis3.getResult();

		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}
}
