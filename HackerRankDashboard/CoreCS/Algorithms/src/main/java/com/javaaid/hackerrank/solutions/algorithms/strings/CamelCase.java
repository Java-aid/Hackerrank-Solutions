/**
 * 
 * Problem Statement-
 * [CamelCase](https://www.hackerrank.com/challenges/camelcase/problem)  
 * 
 */
package com.javaaid.hackerrank.solutions.algorithms.strings;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
class Solution
{
public static void main(String args[])throws IOException
{
 Scanner sc=new Scanner(System.in);
 String s;
  s=sc.next();
 System.out.println(camelCase(s));
}
public static int camelCase(String s)
{
    int c,n,i,x;
    char p=' ';
    s=s+" ";
    c=1;
    n=s.length();
    for(i=0;i<n;i++)
    {
        p=s.charAt(i);
        x=(int)p;
        if((x>=65)&&(x<=90))
        c++;
    }
    return c;
}
}
