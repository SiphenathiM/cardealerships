package ac.za.cput.cardealership.factory.people;

import ac.za.cput.cardealership.domain.people.Address;
import ac.za.cput.cardealership.util.Misc;

public class AddressFactory {

    public static Address getAddress(String street){
        return new Address.Builder().number(Misc.generatedId())
                .street(street)
                .build();
    }
}
