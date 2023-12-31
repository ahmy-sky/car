package com.sky.vehicle;

import com.sky.parent.Vehicle;

public class Boat extends Vehicle {

    private int seats;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Boat() {

    }

    public Boat(String name, int price) {
        super();
        setName(name);
        setPrice(price);
    }

    @Override
    public void gas() {
        System.out.println("The boat is accelerating");
    }

}
