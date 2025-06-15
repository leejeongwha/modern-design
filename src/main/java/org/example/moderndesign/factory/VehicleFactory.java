package org.example.moderndesign.factory;

abstract class VehicleFactory {
    public abstract Vehicle createVehicle();

    public void testVehicle() {
        Vehicle v = createVehicle();
        v.drive();
    }
}
