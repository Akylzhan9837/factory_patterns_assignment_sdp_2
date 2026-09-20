package org.example;

import org.example.factorymethod.FourWheelerFactory;
import org.example.factorymethod.TwoWheelerFactory;
import org.example.factorymethod.Vehicle;
import org.example.factorymethod.VehicleFactory;

import org.example.abstractfactory.CityPartsFactory;
import org.example.abstractfactory.SportPartsFactory;
import org.example.abstractfactory.VehiclePartsClient;
import org.example.abstractfactory.VehiclePartsFactory;

public class Main {

    public static void main(String[] args) {

        // Factory Method
        System.out.println("Factory Method");

        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Vehicle twoWheeler = twoWheelerFactory.createVehicle();
        twoWheeler.drive();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Vehicle fourWheeler = fourWheelerFactory.createVehicle();
        fourWheeler.drive();


        //  Abstract Factory
        System.out.println("\nAbstract Factory");

        VehiclePartsFactory sportFactory = new SportPartsFactory();
        VehiclePartsClient sportClient = new VehiclePartsClient(sportFactory);
        sportClient.useParts();

        VehiclePartsFactory cityFactory = new CityPartsFactory();
        VehiclePartsClient cityClient = new VehiclePartsClient(cityFactory);
        cityClient.useParts();
    }
}