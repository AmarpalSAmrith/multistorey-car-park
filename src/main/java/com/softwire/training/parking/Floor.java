package com.softwire.training.parking;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Floor {

    private int floorNumber;
    private List<ParkingSpace> parkingSpaces = new ArrayList<>();

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Collection<ParkingSpace> getParkingSpaces() {
        return parkingSpaces;
    }

    public void addParkingSpace(ParkingSpace parkingSpace) {
        parkingSpaces.add(parkingSpace);
    }

    public int getCapacity() {
        return parkingSpaces.size();
    }

    public int getNumberOfFreeSpaces() {
        return (int) parkingSpaces.stream()
                .filter(s -> !s.isOccupied())
                .count();
    }
}
