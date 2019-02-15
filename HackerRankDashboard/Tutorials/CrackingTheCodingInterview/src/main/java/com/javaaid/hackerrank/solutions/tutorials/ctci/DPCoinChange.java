/**
 * 
 * Problem Statement-
 * [DP: Coin Change](https://www.hackerrank.com/challenges/ctci-coin-change/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.tutorials.ctci;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class DPCoinChange {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int coins[] = new int[m];
		for (int coins_i = 0; coins_i < m; coins_i++) {
			coins[coins_i] = in.nextInt();
		}
//	        approach1(n, coins);
//	        approach2(n, coins);
		approach3(n, coins);
//	        approach4(n, coins);
		in.close();
	}

	/**
	 * @param n
	 * @param coins
	 */
	private static void approach4(int n, int[] coins) {
		long result = noOfWaysToGetChangeUsingRecursionWithMemo2(coins, n);
		System.out.println(result);
	}

	/**
	 * @param n
	 * @param coins
	 */
	private static void approach3(int n, int[] coins) {
		long result = noOfWaysToGetChangeUsingDP(coins, n);
		System.out.println(result);
	}

	/**
	 * @param n
	 * @param coins
	 */
	private static void approach2(int n, int[] coins) {
		long memo[][] = new long[n + 1][coins.length + 1];
		memo[0][0] = 1;
		long result = noOfWaysToGetChangeUsingRecursionWithMemo(coins, n, 0, memo);
		System.out.println(result);
	}

	/**
	 * @param n
	 * @param coins
	 */
	private static void approach1(int n, int[] coins) {
		long result = noOfWaysToGetChangeUsingRecusion(coins, n, 0);
		System.out.println(result);
	}

	/**
	 * method1 with recursion
	 * 
	 * @param coins
	 * @param n
	 * @return
	 */
	private static long noOfWaysToGetChangeUsingRecusion(int[] coins, int n, int index) {
		if (n == 0)
			return 1;
		if (n < 0 || index >= coins.length)
			return 0;
		return noOfWaysToGetChangeUsingRecusion(coins, n - coins[index], index)
				+ noOfWaysToGetChangeUsingRecusion(coins, n, index + 1);
	}

	/**
	 * method2 with recursion with memorization
	 * 
	 * @param coins
	 * @param n
	 * @return
	 */
	private static long noOfWaysToGetChangeUsingRecursionWithMemo(int[] coins, int n, int index, long[][] memo) {
		if (n == 0)
			return 1;
		if (n < 0 || index >= coins.length)
			return 0;
		if (memo[n][index] != 0)
			return memo[n][index];
		return memo[n][index] = noOfWaysToGetChangeUsingRecursionWithMemo(coins, n - coins[index], index, memo)
				+ noOfWaysToGetChangeUsingRecursionWithMemo(coins, n, index + 1, memo);
	}

	/**
	 * method3 with recursion with memorizaion with hashmap(alternate of method2)
	 * 
	 * @param coins
	 * @param money
	 * @return
	 */
	private static long noOfWaysToGetChangeUsingRecursionWithMemo2(int[] coins, int n) {
		return makeChange(coins, n, 0, new HashMap<String, Long>());
	}

	private static long makeChange(int[] coins, int money, int index, HashMap<String, Long> memo) {
		if (money == 0)
			return 1;
		if (index >= coins.length)
			return 0;

		String key = money + "-" + index;
		if (memo.containsKey(key)) {
			return memo.get(key);
		}

		int amountWithCoin = 0;
		long ways = 0;
		while (amountWithCoin <= money) {
			int remaining = money - amountWithCoin;
			ways += makeChange(coins, remaining, index + 1, memo);
			amountWithCoin += coins[index];
		}
		memo.put(key, ways);
		return ways;
	}

	/**
	 * method4 using dynamic programming approach
	 * 
	 * @param coins
	 * @param n
	 * @param i
	 * @return
	 */
	private static long noOfWaysToGetChangeUsingDP(int[] coins, int n) {
		long dp[] = new long[n + 1];
		dp[0] = 1;
		for (int coin : coins) {
			for (int j = coin; j <= n; j++) {
				dp[j] += dp[j - coin];
			}
		}
		return dp[n];
	}
}
