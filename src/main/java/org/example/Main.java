package org.example;

import org.example.FactoryDesignPattern.Vehicle;
import org.example.FactoryDesignPattern.VehicleFactory;
import org.example.SingletonDesignPattern.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //factory design pattern
        Vehicle car = VehicleFactory.getVehicle("Car");
        car.start();

        //singleton design pattern
        Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();
    }
}