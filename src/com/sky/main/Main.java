package com.sky.main;

import com.sky.parent.Garage;
import com.sky.parent.Vehicle;
import com.sky.vehicle.Boat;
import com.sky.vehicle.Car;

public class Main {

    public static void main(String[] args) throws Exception {
        Garage garage = new Garage();

        Vehicle bmw = new Car();
        bmw.gas();

        Vehicle boat = new Boat();
        boat.gas();

        try {
            garage.storeVehicle(bmw);
            garage.storeVehicle(boat);
            garage.storeVehicle(bmw);
            garage.storeVehicle(boat);

            garage.storeVehicle(bmw);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
