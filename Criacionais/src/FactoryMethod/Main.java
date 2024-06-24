package FactoryMethod;

import FactoryMethod.factory.BicycleFactory;
import FactoryMethod.factory.CarFactory;

public class Main {
    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();
        BicycleFactory bicycleFactory = new BicycleFactory();

        var fusca = carFactory.getVehicle("Fusca");
        fusca.pickUp("João");
        fusca.stop();

        var caloi = bicycleFactory.getVehicle("Caloi");
        caloi.pickUp("Maria");
        caloi.stop();

    }
}