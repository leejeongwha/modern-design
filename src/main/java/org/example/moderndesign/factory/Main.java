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

    /* 
     * () -> new Car(); 대신 생성자 레페런스를 사용하여 팩토리 객체 생성 
     */
    private static void lambda() {
        VehicleLambdaFactory carFactory = VehicleLambdaFactory.createFactory(Car::new);
        carFactory.create().drive();

        VehicleLambdaFactory bikeFactory = VehicleLambdaFactory.createFactory(Bike::new);
        bikeFactory.create().drive();
    }
}
