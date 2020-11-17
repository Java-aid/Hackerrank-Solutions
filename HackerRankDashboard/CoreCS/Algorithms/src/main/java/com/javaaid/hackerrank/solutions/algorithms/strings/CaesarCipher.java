/**
 * 
 * Problem Statement-
 * [Caesar Cipher](https://www.hackerrank.com/challenges/caesar-cipher-1/problem)   
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.strings;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Solutions
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int K = sc.nextInt();
		String passwd=caeserCipher(s,K);
		System.out.println(passwd);
	}
	public static String caeserCipher(String s,int K)
	{	
		K = K % 26;
		int N=s.length();
		String passwd = "";
		for (int i = 0; i < N; i++)
		{
			int ch = s.charAt(i);
			int t = (ch + K);

			if (ch >= 97 && ch <= 122)
			{
				if (t > 122) 
				{
					t = 96 + (t - 122);
				}
				passwd += (char) (t);
			} 
			else if (ch >= 65 && ch <= 90) 
			{
				if (t > 90) 
				{
					t = 64 + (t - 90);
				}
				passwd += (char) (t);
			}
			else 
			{
				passwd += (char) ch;
			}
		}
		return passwd;
	}
}
