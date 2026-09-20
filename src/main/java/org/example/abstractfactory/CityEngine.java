package org.example.abstractfactory;

public class CityEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Starting city engine");
    }
}