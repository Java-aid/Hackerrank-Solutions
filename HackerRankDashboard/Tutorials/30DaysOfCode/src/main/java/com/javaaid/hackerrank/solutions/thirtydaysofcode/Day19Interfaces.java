/**
 * 
 * Problem Statement-
 * [Interfaces](https://www.hackerrank.com/challenges/30-interfaces/problem) 
 * 
 */
package com.javaaid.hackerrank.solutions.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
interface AdvancedArithmetic{
	   int divisorSum(int n);
	}
//renamed Calculator class to Calculator2 class as its already present in Day17 question
class Calculator2 implements AdvancedArithmetic{
    
    public int divisorSum(int n){
        if(n==1)return 1;
       int sum=1+n,r=0;
        for(int i=2;i<n;i++){
         
            r=n%i;
            if(r==0){
                sum=sum+i;
            }
        }
        return sum;
    }
    
}
public class Day19Interfaces {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        scan.close();
	        
	      	AdvancedArithmetic myCalculator = new Calculator2(); 
	        int sum = myCalculator.divisorSum(n);
	        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
	        System.out.println(sum);
	    }
	}
