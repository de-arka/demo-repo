/**
 * 
 */
package com.app.java8.intfc.methods.classes;

import com.app.java8.intfc.methods.intfc.Car;

/**
 * Car Handler Class
 * 
 * @author ArkaDe
 *
 */
public class CarHandler {

	public static void main(String[] args) {
		TataNanoCar nano = new TataNanoCar();
		System.out.println("TATA nano no. of Streeing: " + Car.getNoOfSteerings());
		System.out.println("TATA nano no. of Gears: " + nano.getNoOfGears());
		System.out.println("TATA nano no. of Seats: " + nano.getNoOfSeats() + "\n");

		SkodaRapidCar rapid = new SkodaRapidCar();
		System.out.println("Skoda Rapid no. of Streeing: " + Car.getNoOfSteerings());
		System.out.println("Skoda Rapid no. of Gears: " + rapid.getNoOfGears());
		System.out.println("Skoda Rapid no. of Seats: " + rapid.getNoOfSeats() + "\n");

		ToyotaInnovaCar innova = new ToyotaInnovaCar();
		System.out.println("Toyota Innova no. of Streeing: " + Car.getNoOfSteerings());
		System.out.println("Toyota Innova no. of Gears: " + innova.getNoOfGears());
		System.out.println("Toyota Innova no. of Seats: " + innova.getNoOfSeats());
	}

}
