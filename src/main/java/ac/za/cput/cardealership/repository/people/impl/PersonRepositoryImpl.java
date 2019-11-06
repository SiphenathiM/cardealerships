package ac.za.cput.cardealership.repository.people.impl;

import ac.za.cput.cardealership.domain.people.Person;
import ac.za.cput.cardealership.repository.people.PersonRepository;

import java.util.HashSet;
import java.util.Set;

public class PersonRepositoryImpl implements PersonRepository {

    private static PersonRepository personRepository;
    private Set<Person> personDB;

    private PersonRepositoryImpl(){
        this.personDB = new HashSet<>();
    }

    public static PersonRepository  getPersonRepository(){
        if (personRepository == null) personRepository = new PersonRepositoryImpl();
        return personRepository;
    }


    @Override
    public Person create(Person person) {
        this.personDB.add(person);
        return person;
    }

    @Override
    public Person update(Person person) {
        Person p = read(person.getId());
        if(p != null){
            this.personDB.remove(p);
            return create( person );
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Person p = read(s);
        this.personDB.remove(s);

    }

    @Override
    public Person read(String s) {
        Person p = read(s);
        return this.personDB.stream().filter(person -> person.getId().equalsIgnoreCase(s)).findAny().orElse(null);
    }

    @Override
    public Set<Person> getAll() {
        return this.personDB;
    }
}
