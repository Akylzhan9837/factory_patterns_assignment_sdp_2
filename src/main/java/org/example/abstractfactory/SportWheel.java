package org.example.abstractfactory;

public class SportWheel implements Wheel {

    @Override
    public void rotate() {
        System.out.println("Rotating sport wheel");
    }
}