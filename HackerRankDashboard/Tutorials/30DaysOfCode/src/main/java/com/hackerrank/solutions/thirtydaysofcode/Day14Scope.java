/**
 * 
 */
package com.javaaid.hackerrank.solutions.thirtydaysofcode;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Day14Scope {

	/**
	 * 
	 * @param elements
	 
Difference(int [] elements){
    this.elements=elements;
}
    
 void computeDifference() {
		int maxNum = elements[0];
		int minNum = maxNum;
		for (int i = 1; i < elements.length; i++) {
			
			maxNum=elements[i]>maxNum?elements[i]:maxNum;
			minNum=elements[i]>minNum?minNum:elements[i];
			
		}
		maximumDifference=Math.abs(maxNum-minNum);
	}
	*/
}
