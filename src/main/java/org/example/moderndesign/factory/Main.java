package org.example.moderndesign.factory;

public class Main {
    public static void main(String[] args) {
        leagcy();
        lambda();
    }

    private static void leagcy() {
        VehicleFactory carFactory = new CarFactory();
        carFactory.testVehicle();

        VehicleFactory bikeFactory = new BikeFactory();
        bikeFactory.testVehicle();
    }

    private static void lambda() {
        VehicleLambdaFactory carFactory = VehicleLambdaFactory.createFactory(Car::new);
        carFactory.create().drive();

        VehicleLambdaFactory bikeFactory = VehicleLambdaFactory.createFactory(Bike::new);
        bikeFactory.create().drive();
    }
}
