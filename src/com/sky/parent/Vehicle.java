package com.sky.parent;

public abstract class Vehicle {

    private int wheels;
    private int maxSpeed;
    private int price;
    private String name;

    public void gas() {

    }

    public void brake() {

    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle {" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
