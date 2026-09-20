package org.example.abstractfactory;

public class CityPartsFactory implements VehiclePartsFactory {

    @Override
    public Engine createEngine() {
        return new CityEngine();
    }

    @Override
    public Wheel createWheel() {
        return new CityWheel();
    }
}