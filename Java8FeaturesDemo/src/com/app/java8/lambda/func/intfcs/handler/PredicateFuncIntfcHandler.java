/**
 * 
 */
package com.app.java8.lambda.func.intfcs.handler;

import java.util.List;
import java.util.function.Predicate;

import com.app.java8.stream.model.Employee;
import com.app.java8.stream.model.util.EmployeeUtil;

/**
 * Handler Class to observe Predicate Functional Interface usage
 * 
 * @author ArkaDe
 *
 */
public class PredicateFuncIntfcHandler {

	public static void main(String[] args) {
		// Populating a list of Employees in a List
		List<Employee> empLst = EmployeeUtil.getEmployeeList();

		System.out.println("\n\n\n*********************Predicate Usage****************************");
		// Predicate is a FunctionalInterface having single method - boolean test(T t);
		Predicate<Employee> predicate = emp -> {
			System.out.println("\nFiltering: " + emp);
			return emp.getEmpAge() > 30;
		};
		empLst.stream().filter(predicate).forEach(System.out::println);

		// Minifying the Predicate implementation
		System.out.println("\n\n\n*********************Predicate Usage Minified Approach****************************");
		empLst.stream().filter(emp -> {
			System.out.println("\nFiltering: " + emp);
			return emp.getEmpAge() > 30;
		}).forEach(System.out::println);
	}

}
