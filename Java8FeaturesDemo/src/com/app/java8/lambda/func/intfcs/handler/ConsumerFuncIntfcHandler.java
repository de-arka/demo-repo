package com.app.java8.lambda.func.intfcs.handler;

import java.util.List;
import java.util.function.Consumer;

import com.app.java8.stream.model.Employee;
import com.app.java8.stream.model.util.EmployeeUtil;

public class ConsumerFuncIntfcHandler {
	public static void main(String[] args) {
		// Populating a list of Employees in a List
		List<Employee> empLst = EmployeeUtil.getEmployeeList();

		System.out.println("\n\n\n*********************Consumer Usage****************************");
		// Consumer is a FunctionalInterface having single method - void accept(T t);
		Consumer<Employee> consumer = emp -> {
			emp.setEmpAge(emp.getEmpAge() + 1);
			System.out.println("\nEmployee: " + emp);
		};
		empLst.forEach(consumer);

		// Minifying the Consumer implementation
		System.out.println("\n\n\n*********************Consumer Usage Minified Approach****************************");
		empLst.stream().forEach(emp -> {
			emp.setEmpAge(emp.getEmpAge() + 1);
			System.out.println("\nEmployee: " + emp);
		});
	}
}
