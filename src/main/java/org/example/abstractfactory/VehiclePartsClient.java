package org.example.abstractfactory;

public class VehiclePartsClient {

    private final Engine engine;
    private final Wheel wheel;

    public VehiclePartsClient(VehiclePartsFactory factory) {
        engine = factory.createEngine();
        wheel = factory.createWheel();
    }

    public void useParts() {
        engine.start();
        wheel.rotate();
    }
}