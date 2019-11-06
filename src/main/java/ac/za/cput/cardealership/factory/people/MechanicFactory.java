package ac.za.cput.cardealership.factory.people;

import ac.za.cput.cardealership.domain.people.Mechanic;
import ac.za.cput.cardealership.util.Misc;

public class MechanicFactory {

    public static Mechanic getMechanic(String firstName, String lastName){
        return new Mechanic.Builder().mechanicID(Misc.generatedId())
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }
}
