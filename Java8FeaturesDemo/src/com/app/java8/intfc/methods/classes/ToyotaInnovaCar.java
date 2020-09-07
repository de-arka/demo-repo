package com.app.java8.intfc.methods.classes;

import com.app.java8.intfc.methods.intfc.Car;

/**
 * Entity Definition of ToyotaInnovaCar
 * 
 * @author ArkaDe
 *
 */
public class ToyotaInnovaCar implements Car {

	private static final int NUMBER_OF_SEATS = 8;

	@Override
	public int getNoOfSeats() {
		return NUMBER_OF_SEATS;
	}

}
