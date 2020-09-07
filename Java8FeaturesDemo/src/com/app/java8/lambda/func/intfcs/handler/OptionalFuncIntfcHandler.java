/**
 * 
 */
package com.app.java8.lambda.func.intfcs.handler;

import java.util.List;
import java.util.Optional;

import com.app.java8.stream.model.Employee;
import com.app.java8.stream.model.util.EmployeeUtil;

/**
 * Handler Class to observe Optional Functional Interface usage
 * 
 * @author ArkaDe
 *
 */
public class OptionalFuncIntfcHandler {

	private static String NO_DATA_FOUND = "No Data Found";

	public static void main(String[] args) {
		System.out.println("\n\n\n*********************Supplier Usage Example 1****************************");
		OptionalFuncIntfcHandler ofih = new OptionalFuncIntfcHandler();
		Integer value1 = null;
		Integer value2 = 10;

		// Optional.ofNullable - allows passed parameter to be null.
		Optional<Integer> a = Optional.ofNullable(value1);

		// Optional.of - throws NullPointerException if passed parameter is null
		Optional<Integer> b = Optional.of(value2);
		System.out.println(ofih.sum(a, b));

		System.out.println("\n\n\n*********************Supplier Usage Example 2****************************");
		// Populating a list of Employees in a List
		List<Employee> empLst = EmployeeUtil.getEmployeeList();

		// isPresent()
		Optional<Employee> optEmp = empLst.stream().filter(emp -> emp.getEmpAge() > 20 && emp.getEmpAge() < 25)
				.findAny();
		Employee employee = optEmp.isPresent() ? optEmp.get() : new Employee(NO_DATA_FOUND, 0, NO_DATA_FOUND);
		System.out.println("Employee Found with Age > 20 & Age < 25 : " + employee);

		// .orElse
		employee = empLst.stream().filter(emp -> emp.getEmpAge() > 60).findAny()
				.orElse(new Employee(NO_DATA_FOUND, 0, NO_DATA_FOUND));
		System.out.println("Employee Found with Age > 60 : " + employee);
	}

	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		// Optional.isPresent - checks the value is present or not
		System.out.println("First parameter is present: " + a.isPresent());
		System.out.println("Second parameter is present: " + b.isPresent());

		// Optional.orElse - returns the value if present otherwise returns
		// the default value passed.
		Integer value1 = a.orElse(0);

		// Optional.get - gets the value, value should be present
		Integer value2 = b.isPresent() ? b.get() : null;
		return value1 + value2;
	}

}
