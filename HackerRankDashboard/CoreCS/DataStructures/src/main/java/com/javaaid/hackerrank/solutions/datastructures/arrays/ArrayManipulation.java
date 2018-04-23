/**
 * 
 */
package com.javaaid.hackerrank.solutions.datastructures.arrays;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class ArrayManipulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long inputArray[] = new long[n+1];
		while(m-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int value=sc.nextInt();
			inputArray[a-1]+=value;
			inputArray[b]-=value;
		}
		long max=getMax(inputArray);
		System.out.println(max);
		sc.close();
	}

	/**
	 * @param inputArray
	 * @return
	 */
	private static long getMax(long[] inputArray) {
		long max=Long.MIN_VALUE;
		long sum=0;
		for(int i=0;i<inputArray.length;i++) {
			sum+=inputArray[i];
			max=Math.max(max, sum);
		}
		return max;
	}

}
