package ac.za.cput.cardealership.factory.vihacle;

import ac.za.cput.cardealership.domain.vehicle.Car;
import ac.za.cput.cardealership.util.Misc;

public class CarFactory {

    public static Car getCar(String name ,String kmTraveled){
        return new Car.Builder().id(Misc.generatedId())
                .name(name)
                .kmTraveled(kmTraveled)
                .build();
    }
}
