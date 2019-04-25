package com.softwire.training.parking;

import java.util.*;

public class MultiStorey {

    private List<Floor> carPark;

    public MultiStorey(Collection<Floor> floors) {
        carPark = new ArrayList<>(floors);
    }

    public MultiStorey(Floor... floors) {
        this(Arrays.asList(floors));
    }

    public Collection<Floor> getFloors() {
        // TODO - replace this!
        return carPark;
    }

    public ParkingSpace getNearestSpaceForVehicle(Vehicle vehicle) {
        return carPark.stream()
                .sorted(Comparator.comparing(Floor::getFloorNumber))
                .map(f -> f.getNearestFreeSpaceForVehicle(vehicle))
                .filter(Objects::nonNull)
                .findFirst()
                .orElse(null);
    }

    public ParkingSpace getSpaceContainingVehicleWithRegistration(String registration) {
        // TODO - replace this!
        return null;
    }
}
