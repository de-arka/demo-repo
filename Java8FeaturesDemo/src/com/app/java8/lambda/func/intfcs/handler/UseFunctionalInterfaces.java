package com.app.java8.lambda.func.intfcs.handler;

import com.app.java8.lambda.func.intfcs.MyFunctionalInterface;

/**
 * Class to understand the influence of Lambda expression in Functional
 * Interface
 * 
 * @author ArkaDe
 *
 */
public class UseFunctionalInterfaces {
	public static void main(String[] args) {
		MyFunctionalInterface funcIntfc = (String firstName, String lastName) -> System.out.println(String
				.format("Hello!! %s %s, You are in InterfaceLambdaNArgMthd welcome() method....", firstName, lastName));
		funcIntfc.welcome("Arka", "De");

		System.out.println("\n\n\n*********************Optional Usage****************************");

	}
}
