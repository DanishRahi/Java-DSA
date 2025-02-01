package vehile_temp;

import vehicle.Vehicle;

public class Truck extends Vehicle {
	int maxloadingCapacity;
	public void print() {
		System.out.println("Truck capacity: " + maxloadingCapacity);
		System.out.println("truck color: " + color);
		System.out.println("Truck Speed: " + getMaxSpeed());
	}

}
