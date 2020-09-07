package com.app.java8.intfc.methods.intfc;

/**
 * Contract Definition of a Car
 * 
 * @author ArkaDe
 *
 */
public interface Car {
	
	int NUMBER_OF_STEERINGS = 1;
	int NUMBER_OF_GEARS = 5;

	public int getNoOfSeats();
	
	public default int getNoOfGears() {
		return NUMBER_OF_GEARS;
	}
	
	public static int getNoOfSteerings() {
		return NUMBER_OF_STEERINGS;
	}

}
