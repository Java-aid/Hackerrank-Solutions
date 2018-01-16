/**
 * 
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
	static int[] acmTeam(String[] topic) {
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
