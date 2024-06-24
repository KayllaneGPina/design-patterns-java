package FactoryMethod.vehicle;

public class Bicycle implements Vehicle {

    private String name;

    public Bicycle(String name) {
        this.name = name;
    }

    @Override
    public void pickUp(String customerName) {
        System.out.println(this.name + " está buscando " + customerName);
    }

    @Override
    public void stop() {
        System.out.println(this.name + " parou");
    }
}
