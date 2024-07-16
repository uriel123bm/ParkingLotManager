package org.example;

public class ParkingLotManager {
    private static ParkingLotManager instance;
    private int availableSpots;

    // Private constructor to prevent instantiation
    private ParkingLotManager() {
        availableSpots = 100; // Example initial value
    }

    // Static method to get the single instance of the class
    public static ParkingLotManager getInstance() {
        if (instance == null) {
            instance = new ParkingLotManager();
        }
        return instance;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public void parkVehicle() {
        if (availableSpots > 0) {
            availableSpots--;
        } else {
            System.out.println("No available spots!");
        }
    }

    public void leaveVehicle() {
        availableSpots++;
    }
}
