package ac.za.cput.cardealership.factory.people;

import ac.za.cput.cardealership.domain.people.Person;
import ac.za.cput.cardealership.util.Misc;

public class PersonFactory {

    public static Person getPerson(String firstname, String lastname , String phoneNumber){
        return new Person.Builder().id(Misc.generatedId())
                .firstname(firstname)
                .lastname(lastname)
                .phoneNumber(phoneNumber)
                .build();
    }
}

