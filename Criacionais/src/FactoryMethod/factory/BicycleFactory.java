package FactoryMethod.factory;

import FactoryMethod.vehicle.Bicycle;
import FactoryMethod.vehicle.Vehicle;

public class BicycleFactory extends VehicleFactory {
    @Override
    public Vehicle getVehicle(String vehicleName) {
        return new Bicycle(vehicleName);
    }
}
