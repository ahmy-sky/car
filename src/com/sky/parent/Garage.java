package com.sky.parent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Garage extends Vehicle {

    private boolean propeller;
    private int noOfPassengers;
    private int spaceRemaining;
    private List<Vehicle> parked = new ArrayList<>();

    public boolean isPropeller() {
        return propeller;
    }

    public void setPropeller(boolean propeller) {
        this.propeller = propeller;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public int getSpaceRemaining() {
        return spaceRemaining;
    }

    public void setSpaceRemaining(int spaceRemaining) {
        this.spaceRemaining = spaceRemaining;
    }

    public void storeVehicle(Vehicle vehicle) throws Exception {
        if (this.spaceRemaining >= 3) {
            throw new Exception("garage has no space remaining to store vehicle");
        }
        this.spaceRemaining += 1;
        this.parked.add(vehicle);
        System.out.println("Vehicle added to garage, remaining space: " + (3 - this.spaceRemaining));
    }

    public List<Vehicle> getParked() {
        return parked;
    }



}
