package ac.za.cput.cardealership.factory.vihacle;

import ac.za.cput.cardealership.domain.vehicle.Manufacturer;

public class ManufacturerFactory {

    public static Manufacturer getManufacturer(String name, String address){
        return new Manufacturer.Builder().name(name)
                .address(address)
                .build();
    }
}
