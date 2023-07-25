package com.sky.main;

import com.sky.parent.Garage;
import com.sky.parent.Vehicle;
import com.sky.vehicle.Boat;
import com.sky.vehicle.Car;

public class Main {

    public static void main(String[] args) throws Exception {
        Garage garage = new Garage();

        Vehicle bmw = new Car("BMW", 2000);
        bmw.gas();

        Vehicle boat = new Boat("BOAT", 1000);
        boat.gas();

        try {
            garage.storeVehicle(bmw);
            garage.storeVehicle(boat);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(garage.getParked().toString());

    }
}
