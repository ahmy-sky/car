package com.sky.vehicle;

import com.sky.parent.Vehicle;

public class Car extends Vehicle {

    private int seats;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Car() {

    }

    public Car(String name, int price) {
        super();
        setName(name);
        setPrice(price);
    }

    @Override
    public void gas() {
        System.out.println("The car is accelerating");
    }

}
