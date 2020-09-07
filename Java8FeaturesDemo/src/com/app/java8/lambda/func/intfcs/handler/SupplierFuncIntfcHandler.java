/**
 * 
 */
package com.app.java8.lambda.func.intfcs.handler;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

/**
 * Handler Class to observe Supplier Functional Interface usage
 * 
 * @author ArkaDe
 *
 */
public class SupplierFuncIntfcHandler {

	public static void main(String[] args) {
		System.out.println("\n\n\n*********************Supplier Usage****************************");
		// Supplier is a FunctionalInterface having single method - T get();
		// Suppliers are useful when we don’t need to supply any value and obtain a
		// result at the same time.
		Supplier<Double> randomValue1 = () -> Math.random();
		System.out.println(randomValue1.get());

		// Wrapper interface for Double
		DoubleSupplier randomValue2 = Math::random;
		System.out.println(randomValue2.getAsDouble());
	}

}
