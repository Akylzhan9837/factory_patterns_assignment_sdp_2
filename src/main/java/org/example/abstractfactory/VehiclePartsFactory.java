package org.example.abstractfactory;

public interface VehiclePartsFactory {

    Engine createEngine();

    Wheel createWheel();
}