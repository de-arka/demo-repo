/**
 * 
 */
package com.app.java8.lambda.classes;

import com.app.java8.lambda.intfcs.InterfaceInnerClass;
import com.app.java8.lambda.intfcs.InterfaceLambda;
import com.app.java8.lambda.intfcs.InterfaceLambdaNArgMthd;

/**
 * Class to observe the different behavior of Interface implementation and
 * Lambda contribution to it
 * 
 * @author ArkaDe
 *
 */
public class InterfaceHandler {

	public static void main(String[] args) {
		TraditionalImplementer trdImpl = new TraditionalImplementer();
		trdImpl.show();

		// No separate Class Definition were required
		InterfaceInnerClass intfcInnCls = new InterfaceInnerClass() {
			@Override
			public void show() {
				System.out.println("In InterfaceInnerClass show() method....");
			}
		};
		intfcInnCls.show();

		// No .class file related to any InnerClass got generated
		InterfaceLambda intfcLambda = () -> System.out.println("In InterfaceLambda show() method....");
		intfcLambda.show();

		InterfaceLambdaNArgMthd intfcLambdaNArgMthd = (String firstName, String lastName) -> System.out.println(String
				.format("Hello!! %s %s, You are in InterfaceLambdaNArgMthd welcome() method....", firstName, lastName));
		intfcLambdaNArgMthd.welcome("Arka", "De");
	}

}
