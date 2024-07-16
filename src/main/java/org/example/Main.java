package org.example;

public class Main {
    public static void main(String[] args) {
        // Get the ParkingLotManager instance
        ParkingLotManager manager = ParkingLotManager.getInstance();

        // Create vehicles using the VehicleFactory
        Vehicle car = VehicleFactory.createVehicle("car", "ABC123");
        Vehicle motorcycle = VehicleFactory.createVehicle("motorcycle", "XYZ789");
        Vehicle truck = VehicleFactory.createVehicle("truck", "LMN456");

        // Park vehicles
        manager.parkVehicle();
        System.out.println("Available spots after parking a car: " + manager.getAvailableSpots());

        manager.parkVehicle();
        System.out.println("Available spots after parking a motorcycle: " + manager.getAvailableSpots());

        manager.parkVehicle();
        System.out.println("Available spots after parking a truck: " + manager.getAvailableSpots());

        // Leave vehicles
        manager.leaveVehicle();
        System.out.println("Available spots after a car leaves: " + manager.getAvailableSpots());

        manager.leaveVehicle();
        System.out.println("Available spots after a motorcycle leaves: " + manager.getAvailableSpots());

        manager.leaveVehicle();
        System.out.println("Available spots after a truck leaves: " + manager.getAvailableSpots());
    }
}
