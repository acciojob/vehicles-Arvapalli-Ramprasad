package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);


        Boat boat = new Boat("Boaty McBoatface", 10);
        System.out.println("Boat name: " + boat.getVehicleName());
        System.out.println("Boat capacity: " + boat.getVehicleCapacity());
    }
}
