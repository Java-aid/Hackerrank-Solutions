/**
 * 
 * Problem Statement-
 * [Hash Tables: Ice Cream Parlor](https://www.hackerrank.com/challenges/ctci-ice-cream-parlor/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.tutorials.ctci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class HashTablesIceCreamParlor {
	static void solve(int[] arr, int money) {
	       Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	        int len=arr.length;
	        for(int i=1;i<=len;i++){
	          map.put(arr[i-1], i);
	    }
	        for(int i=1;i<=len;i++){
		          if(map.containsKey(arr[i-1]) && map.containsKey(Math.abs(money-arr[i-1]))) {
		        	  System.out.println(i+" "+map.get(Math.abs(money-arr[i-1])));
		        	  break;
		          }
		    }
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int money = in.nextInt();
			int n = in.nextInt();
			int[] arr = new int[n];
			for (int arr_i = 0; arr_i < n; arr_i++) {
				arr[arr_i] = in.nextInt();
			}
			solve(arr, money);
		}
		in.close();
	}
}
