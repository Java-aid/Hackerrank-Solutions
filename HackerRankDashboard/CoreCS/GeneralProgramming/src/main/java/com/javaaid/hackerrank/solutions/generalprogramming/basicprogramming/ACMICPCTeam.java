/**
 * 
 * Problem Statement-
 * [ACM ICPC Team](https://www.hackerrank.com/challenges/acm-icpc-team/problem)
 * [Tutorial](https://youtu.be/0THr0OGqSDY)
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;

import java.math.BigInteger;
import java.util.BitSet;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class ACMICPCTeam {

	// 1st approach
	static int[] acmTeam(String[] topic) {

		int n = topic.length;
		BigInteger[] bi = new BigInteger[n];

		for (int i = 0; i < n; i++)
			bi[i] = new BigInteger(topic[i], 2);

		int maxTopic = 0;
		int teamCount = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				BigInteger iuj = bi[i].or(bi[j]);
				int bitCount = iuj.bitCount();
				if (bitCount > maxTopic) {
					maxTopic = bitCount;
					teamCount = 1;
				} else if (bitCount == maxTopic) {
					teamCount++;
				}
			}
		}

		int result[] = { maxTopic, teamCount };
		return result;
	}

	// 2nd approach--using java BitSet class
	static int[] acmTeamUsingBitSet(String[] topic) {
		int teamCount = 0, maxTopic = 0;
		int size = topic.length;

		BitSet[] bitset = new BitSet[size];
		for (int i = 0; i < size; i++) {
			BigInteger b1 = new BigInteger(topic[i], 2);
			bitset[i] = BitSet.valueOf(b1.toByteArray());
		}
		for (int i = 0; i < size - 1; i++) {
			BitSet bitset1 = bitset[i];
			for (int j = i + 1; j < size; j++) {
				BitSet bitset2 = bitset[j];
				BitSet tmpset = new BitSet();
				tmpset.or(bitset1);
				tmpset.or(bitset2);
				if (tmpset.cardinality() > maxTopic) {
					maxTopic = tmpset.cardinality();
					teamCount = 1;
				} else if (maxTopic == tmpset.cardinality()) {
					teamCount++;
				}
			}

		}
		int result[] = { maxTopic, teamCount };
		return result;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		String[] topic = new String[n];
		for (int topic_i = 0; topic_i < n; topic_i++) {
			topic[topic_i] = in.next();
		}
		int[] result = acmTeam(topic);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

		in.close();
	}
}
