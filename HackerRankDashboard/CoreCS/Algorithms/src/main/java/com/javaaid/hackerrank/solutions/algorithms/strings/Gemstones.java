/**
 * 
 * Problem Statement-
 * [Gemstones](https://www.hackerrank.com/challenges/gem-stones/problem)   
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.strings;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Gemstones {
	 static int gemstones(String[] arr) {
			int rockNum = 0;
			int gemCount=0;
			int[] compositions = new int[27];
			int noOfRocks = arr.length;
			for (rockNum= 1; rockNum <= noOfRocks; rockNum++) {
				String rock = arr[rockNum-1];
				storeComposition(compositions, rock, rockNum);
			}
			for(int element:compositions) {
				if(element==noOfRocks)
					gemCount++;
			}
			return gemCount;
		}

		/**
		 * @param compositions
		 * @param rock
		 */
		private static void storeComposition(int[] compositions, String rock, int rockNum) {
			for (int i = 0; i < rock.length(); i++) {
				int index = rock.charAt(i) - 'a';
				if(rockNum==1) {
					compositions[index]=1;
				}else {
					if (compositions[index] >= rockNum - 1)
						compositions[index] = rockNum;
				}			
			}
		}

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			String[] arr = new String[n];
			for (int arr_i = 0; arr_i < n; arr_i++) {
				arr[arr_i] = in.next();
			}
			int result = gemstones(arr);
			System.out.println(result);
			in.close();
		}
	}
