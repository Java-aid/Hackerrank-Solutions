/**
 * 
 * Problem Statement-
 * [Minimum Loss](https://www.hackerrank.com/challenges/minimum-loss/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class MinimumLoss {
	static int minimumLoss(long[] price) {
		Map<Long,Integer> map=new HashMap<Long,Integer>();
		for(int i=0;i<price.length;i++) {
			map.put(price[i], i);
		}
		Arrays.sort(price);
		long min=Long.MAX_VALUE;
		for(int i=price.length-1;i>0;i--) {
			long diff=price[i]-price[i-1];
			if( diff<min && map.get(price[i])<map.get(price[i-1])) {
				min=Math.abs(diff);
			}
		}
		return (int) min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] price = new long[n];
        for(int price_i = 0; price_i < n; price_i++){
            price[price_i] = in.nextLong();
        }
        int result = minimumLoss(price);
        System.out.println(result);
        in.close();
    }
}
