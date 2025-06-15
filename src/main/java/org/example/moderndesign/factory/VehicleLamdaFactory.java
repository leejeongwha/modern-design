package org.example.moderndesign.factory;

import java.util.function.Supplier;

public interface VehicleLamdaFactory {
    Vehicle create();

    static VehicleLamdaFactory createFactory(Supplier<Vehicle> supplier) {
        return supplier::get;
    }
}
