package com.app.java8.lambda.classes;

import com.app.java8.lambda.intfcs.InterfaceTraditional;

/**
 * Class to implement the traditional contract between an Interface and a Class
 * 
 * @author ArkaDe
 *
 */
public class TraditionalImplementer implements InterfaceTraditional {

	@Override
	public void show() {
		System.out.println("In TraditionalImplementer show() method....");
	}

}
