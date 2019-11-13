/**
 * 
 * Problem Statement-
 * [Solve Me First](https://www.hackerrank.com/challenges/solve-me-first) 
 * [Tutorial](https://youtu.be/iHhFPu7h7Ic) 
 * 
 */
package com.javaaid.hackerrank.solutions.generalprogramming.basicprogramming;
import java.util.Scanner;

/**
 * 
 * @author Kanahaiya Gupta
 *
 */
public class SolveMeFirst {

    static int solveMeFirst(int a, int b) {
        return a+b;
   }

   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
        in.close();
   }
}
