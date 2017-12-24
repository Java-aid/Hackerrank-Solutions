/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.advanced;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JavaSingletonPattern {
	public String str = "";
	private static final JavaSingletonPattern instance=null;

	private JavaSingletonPattern() {

	}

	public static JavaSingletonPattern getSingleInstance() {
		if (instance == null)
			return new JavaSingletonPattern();
		return instance;
	}

}
