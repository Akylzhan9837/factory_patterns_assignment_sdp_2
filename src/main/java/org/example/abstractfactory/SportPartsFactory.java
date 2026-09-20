package org.example.abstractfactory;

public class SportPartsFactory implements VehiclePartsFactory {

    @Override
    public Engine createEngine() {
        return new SportEngine();
    }

    @Override
    public Wheel createWheel() {
        return new SportWheel();
    }
}