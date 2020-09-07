package com.app.java8.lambda.func.intfcs;

/**
 * Functional Interface to understand the contribution of Lambda Expression to
 * it
 * 
 * @author ArkaDe
 *
 */
@FunctionalInterface
public interface MyFunctionalInterface {
	public void welcome(String firstName, String lastName);
	// If we try to add more than one method in @FunctionalInterface, it will give
	// Compilation Error like Invalid '@FunctionalInterface' annotation;
	// MyFunctionalInterface is not a functional interface
	// public void welcome(String initials, String firstName, String lastName);
}
