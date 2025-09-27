package org.example.FactoryDesignPattern;

public class Truck implements Vehicle{
    @Override
    public void start() {
        System.out.println("truck start");
    }

    @Override
    public void stop() {
        System.out.println("truck stop");
    }
}
