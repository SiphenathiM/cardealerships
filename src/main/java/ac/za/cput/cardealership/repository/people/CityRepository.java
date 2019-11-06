package ac.za.cput.cardealership.repository.people;

import ac.za.cput.cardealership.domain.people.City;
import ac.za.cput.cardealership.repository.IRepository.IRepository;

import java.util.Set;

public interface CityRepository extends IRepository<City,String> {

    Set<City> getAll();

}
