package com.softwire.training.parking;

public class ParkingSpace {

    private int id;
    private double maxHeight;
    private double maxWidth;
    private Vehicle.Type typeRestriction;
    private Vehicle parkedVehicle;

    public ParkingSpace(int id, double maxHeight, double maxWidth) {
        this.id = id;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
    }

    public ParkingSpace(int id, double maxHeight, double maxWidth, Vehicle.Type typeRestriction) {
        this.id = id;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
        this.typeRestriction = typeRestriction;
    }

    public int getId() {
        return id;
    }

    public boolean isVehicleAllowed(Vehicle vehicle) {
        return vehicle.getHeight() <= maxHeight && vehicle.getWidth() <= maxWidth && (typeRestriction == null || vehicle.getType() == typeRestriction);
    }

    public void parkVehicle(Vehicle vehicle) throws IllegalArgumentException, IllegalStateException {
        if (!isVehicleAllowed(vehicle)) {
            throw new IllegalArgumentException();
        } else if (isOccupied()) {
            throw new IllegalStateException();
        } else {
            parkedVehicle = vehicle;
        }
    }

    public void vacate() {
        if (parkedVehicle != null) {
            parkedVehicle = null;
        }
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public boolean isOccupied() {
        return parkedVehicle != null;
    }
}
