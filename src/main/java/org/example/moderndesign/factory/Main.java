package org.example.moderndesign.factory;

public class Main {
    public static void main(String[] args) {
        leagcy();
        lamda();
    }

    private static void leagcy() {
        VehicleFactory carFactory = new CarFactory();
        carFactory.testVehicle();

        VehicleFactory bikeFactory = new BikeFactory();
        bikeFactory.testVehicle();
    }

    private static void lamda() {
        VehicleLamdaFactory carFactory = VehicleLamdaFactory.createFactory(Car::new);
        carFactory.create().drive();

        VehicleLamdaFactory bikeFactory = VehicleLamdaFactory.createFactory(Bike::new);
        bikeFactory.create().drive();
    }
}
