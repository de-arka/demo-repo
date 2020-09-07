package com.app.java8.intfc.methods.classes;

import com.app.java8.intfc.methods.intfc.Car;

/**
 * Entity Definition of SkodaRapidCard
 * 
 * @author ArkaDe
 *
 */
public class SkodaRapidCar implements Car {

	private static final int NUMBER_OF_SEATS = 5;

	private int NUMBER_OF_GEARS = 6;

	@Override
	public int getNoOfSeats() {
		return NUMBER_OF_SEATS;
	}

	@Override
	public int getNoOfGears() {
		return NUMBER_OF_GEARS;
	}

}
