/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.advanced;

import java.security.Permission;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */

interface Food {
	public String getType();
}

class Pizza implements Food {
	public String getType() {
		return "Someone ordered a Fast Food!";
	}
}

class Cake implements Food {

	public String getType() {
		return "Someone ordered a Dessert!";
	}
}

class FoodFactory {
	public Food getFood(String order) {

		/**
		 * main code starts from here
		 */

		if (order.equalsIgnoreCase("Pizza")) {
			return new Pizza();
		} else if (order.equalsIgnoreCase("Cake")) {
			return new Cake();
		}
		return null;

		/** main code end herer */

	}// End of getFood method

}// End of factory class

public class JavaFactoryPattern {

	public static void main(String args[]) {
		Do_Not_Terminate.forbidExit();
		Scanner sc = null;
		try {

			sc = new Scanner(System.in);
			// creating the factory
			FoodFactory foodFactory = new FoodFactory();

			// factory instantiates an object
			Food food = foodFactory.getFood(sc.nextLine());

			System.out.println("The factory returned " + food.getClass());
			System.out.println(food.getType());
		} catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		} finally {
			sc.close();
		}
	}

}

class Do_Not_Terminate {

	public static class ExitTrappedException extends SecurityException {

		private static final long serialVersionUID = 1L;
	}

	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().contains("exitVM")) {
					throw new ExitTrappedException();
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
}
