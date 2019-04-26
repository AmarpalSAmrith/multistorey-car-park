package com.softwire.training.parking;


import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

public class ReadCSVFile {

    public static List<ParkingSpace> getSpacesFromCSV(String filename) throws IOException {

        List<String> csvFile = new ArrayList<>(Files.readAllLines(Paths.get(filename)));
        List<ParkingSpace> spacesFromCSV = new ArrayList<>();
        for (String line : csvFile) {
            spacesFromCSV.add(eachSpace(line));
        }
        return spacesFromCSV;
    }
    private static ParkingSpace eachSpace (String csvLine) {
        String[] line = csvLine.split(",");
        
    }
}