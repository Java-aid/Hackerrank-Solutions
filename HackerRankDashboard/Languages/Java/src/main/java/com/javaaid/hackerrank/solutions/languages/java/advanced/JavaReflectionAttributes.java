/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.advanced;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Kanahaiya Gupta
 *
 */

class Student {
	private String name;
	private String id;
	private String email;

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void anothermethod() {
	}
}

public class JavaReflectionAttributes {
	public static void main(String[] args) {
		Class student = new Student().getClass();
		Method[] methods = student.getDeclaredMethods();
		ArrayList<String> methodList = new ArrayList<>();
		for (Method m : methods) {
			methodList.add(m.getName());
		}
		Collections.sort(methodList);
		for (String name : methodList) {
			System.out.println(name);
		}
	}

}
