/**
 * 
 */
package com.app.java8.stream.model.util;

import java.util.ArrayList;
import java.util.List;

import com.app.java8.stream.model.Employee;

/**
 * Utility Class to populate List of Employee Details
 * 
 * @author ArkaDe
 *
 */
public class EmployeeUtil {

	private EmployeeUtil() {
	}

	public static List<Employee> getEmployeeList() {
		List<Employee> empLst = new ArrayList<>();
		empLst.add(new Employee("emp1", 58, "Delhi"));
		empLst.add(new Employee("emp2", 35, "Mumbai"));
		empLst.add(new Employee("emp3", 45, "Kolkata"));
		empLst.add(new Employee("emp4", 55, "Chennai"));
		empLst.add(new Employee("emp5", 22, "Hyderabad"));
		empLst.add(new Employee("emp6", 26, "Bangalore"));
		empLst.add(new Employee("emp7", 28, "Pune"));
		return empLst;
	}
}
