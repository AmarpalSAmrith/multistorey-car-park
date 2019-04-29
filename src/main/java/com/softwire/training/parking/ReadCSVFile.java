package com.softwire.training.parking;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReadCSVFile {

    public static MultiStorey getCarParkFromCsv(String filename) throws IOException {

        List<String> csvFile = new ArrayList<>(Files.readAllLines(Paths.get(filename)));

        HashMap<Integer, Floor> floors = new HashMap<>();

        for (String line : csvFile) {
            int floorNumber = getFloorNumberFromLine(line);
            ParkingSpace parkingSpace = getParkingSpaceFromLine(line);
            floors.computeIfAbsent(floorNumber, Floor::new).addParkingSpace(parkingSpace);
        }
        return new MultiStorey(floors.values());
    }

    private static ParkingSpace getParkingSpaceFromLine(String csvLine) {
        String[] line = csvLine.split(",");
        return new ParkingSpace(Integer.valueOf(line[1]),
                Double.valueOf(line[3]),
                Double.valueOf(line[2]),
                Vehicle.Type.valueOf(line[4]));

    }
    private  static int getFloorNumberFromLine(String csvLine) {
        String[] line = csvLine.split(" ");
        return Integer.valueOf(line[0]);
    }
}