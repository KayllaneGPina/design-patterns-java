package FactoryMethod.factory;

import FactoryMethod.vehicle.Vehicle;

public abstract class VehicleFactory {

    public abstract Vehicle getVehicle(String vehicleName);

    public Vehicle pickUp(String customerName, String vehicleName) {
        Vehicle car = this.getVehicle(vehicleName);
        car.pickUp(customerName);
        return car;
    }
}
