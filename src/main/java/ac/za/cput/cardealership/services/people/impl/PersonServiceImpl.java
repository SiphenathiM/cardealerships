package ac.za.cput.cardealership.services.people.impl;

import ac.za.cput.cardealership.domain.people.Person;
import ac.za.cput.cardealership.repository.people.PersonRepository;
import ac.za.cput.cardealership.repository.people.impl.PersonRepositoryImpl;
import ac.za.cput.cardealership.services.people.PersonService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PersonServiceImpl implements PersonService {

    private static PersonService personService = null;
    private PersonRepository personRepository;

    private PersonServiceImpl(){
        this.personRepository= PersonRepositoryImpl.getPersonRepository();
    }

    public static PersonService getRepository(){
        if (personService == null) personService = new PersonServiceImpl();
        return personService;
    }


    @Override
    public Person create(Person person) {
        return  this.personRepository.create(person);
    }

    @Override
    public Person update(Person person) {
      return  this.personRepository.update(person);
    }

    @Override
    public void delete(String s) {
        this.personRepository.delete(s);
    }

    @Override
    public Person read(String s) {
        return this.personRepository.read(s);
    }

    @Override
    public Set<Person> getAll()
    {
        return this.personRepository.getAll();
    }
}
