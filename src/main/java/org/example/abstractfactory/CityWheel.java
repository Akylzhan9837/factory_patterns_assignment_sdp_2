package org.example.abstractfactory;

public class CityWheel implements Wheel {

    @Override
    public void rotate() {
        System.out.println("Rotating city wheel");
    }
}