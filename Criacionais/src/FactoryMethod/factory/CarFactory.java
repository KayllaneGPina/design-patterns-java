package FactoryMethod.factory;

import FactoryMethod.vehicle.Car;
import FactoryMethod.vehicle.Vehicle;

public class CarFactory extends VehicleFactory{
    @Override
    public Vehicle getVehicle(String vehicleName) {
        return new Car(vehicleName);
    }
}
