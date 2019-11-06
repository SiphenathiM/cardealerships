package ac.za.cput.cardealership.services.people;

import ac.za.cput.cardealership.domain.people.Person;
import ac.za.cput.cardealership.services.IService.IService;

import java.util.Set;

public interface PersonService extends IService<Person,String> {

    Set<Person> getAll();

}
