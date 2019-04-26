package com.softwire.training.parking;

public class Vehicle {

    private Type type;
    private String registration;
    private double height;
    private double width;

    public Vehicle(Type type, String registration, double height, double width) {
        this.type = type;
        this.registration = registration;
        this.height = height;
        this.width = width;
    }

    public Type getType() {
        // TODO - replace this!
        return type;
    }

    public String getRegistration() {
        // TODO - replace this!
        return registration;
    }

    public double getHeight() {
        // TODO - replace this!
        return height;
    }

    public double getWidth() {
        // TODO - replace this!
        return width;
    }

    public enum Type {
        CAR,
        MOTORCYCLE,
        VAN,
    }
}
