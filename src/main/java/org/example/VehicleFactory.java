package org.example;

public class VehicleFactory {
    // Static method to create vehicles based on the type
    public static Vehicle createVehicle(String type, String licenseNumber) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car(licenseNumber);
            case "motorcycle":
                return new Motorcycle(licenseNumber);
            case "truck":
                return new Truck(licenseNumber);
            default:
                throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}
