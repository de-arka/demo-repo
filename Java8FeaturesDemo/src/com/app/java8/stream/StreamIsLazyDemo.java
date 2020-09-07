package com.app.java8.stream;

import java.util.List;

import com.app.java8.stream.model.Employee;
import com.app.java8.stream.model.util.EmployeeUtil;

public class StreamIsLazyDemo {
	public static void main(String[] args) {
		List<Employee> empLst = EmployeeUtil.getEmployeeList();

		// Lombok @Data Annotation is used over the Employee Model, thus Setter, Getter,
		// equals(), hashCode() & toString() methods are already handled by Lombok.
		System.out.println("\nThe Employee List....");
		empLst.stream().forEach(System.out::println);

		System.out.println("\nWhat does this Lazy Stream do with an Imtermediate Operator only?....");
		empLst.stream().filter(emp -> {
			System.out.println("\nFiltering: " + emp);
			return emp.getEmpAge() > 30;
		});

		System.out.println("\nThe Same Stream with a Terminal Operator....");
		empLst.stream().filter(emp -> {
			System.out.println("\nFiltering: " + emp);
			return emp.getEmpAge() > 30;
		}).forEach(System.out::println);
	}
}
