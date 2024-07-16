package org.example;

public abstract class Vehicle {
    protected String licenseNumber;
    protected String vehicleType;

    public Vehicle(String licenseNumber, String vehicleType) {
        this.licenseNumber = licenseNumber;
        this.vehicleType = vehicleType;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}

