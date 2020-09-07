/**
 * 
 */
package com.app.java8.stream.model;

import lombok.Data;

/**
 * Employee Model Definition
 * 
 * @author ArkaDe
 *
 */
@Data
public class Employee {
	
	private String empName;
	private int empAge;
	private String empAddr;

	public Employee() {
		super();
	}

	public Employee(String empName, int empAge, String empAddr) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empAddr = empAddr;
	}
	
}
