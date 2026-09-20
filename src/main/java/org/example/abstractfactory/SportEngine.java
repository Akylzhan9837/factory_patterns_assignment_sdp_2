package org.example.abstractfactory;

public class SportEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Starting sport engine");
    }
}