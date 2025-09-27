package org.example.FactoryDesignPattern;

import java.util.Objects;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleName)
    {
        if(Objects.equals(vehicleName, "Car"))
        {
            return new Car();
        }
        else if(Objects.equals(vehicleName, "Truck"))
        {
            return new Truck();
        } else if (Objects.equals(vehicleName, "Bike")) {
            return new Bike();
        }
        throw new IllegalArgumentException("Unknown vehicle type");
    }
}
