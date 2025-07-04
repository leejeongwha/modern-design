package org.example.moderndesign.factory;

import java.util.function.Supplier;

@FunctionalInterface
public interface VehicleLambdaFactory {
    Vehicle create();

    static VehicleLambdaFactory createFactory(Supplier<Vehicle> supplier) {
        return supplier::get;
    }
}
