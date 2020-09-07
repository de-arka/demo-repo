package com.app.java8.intfc.methods.classes;

import com.app.java8.intfc.methods.intfc.Car;

/**
 * Entity Definition of TataNanoCar
 * 
 * @author ArkaDe
 *
 */
public class TataNanoCar implements Car {

	private static final int NUMBER_OF_SEATS = 4;
	
	private int NUMBER_OF_GEARS = 4;

	@Override
	public int getNoOfSeats() {
		return NUMBER_OF_SEATS;
	}
	
	@Override
	public int getNoOfGears() {
		return NUMBER_OF_GEARS;
	}

}
