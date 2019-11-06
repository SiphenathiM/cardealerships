package ac.za.cput.cardealership.repository.people;


import ac.za.cput.cardealership.domain.people.Salesperson;
import ac.za.cput.cardealership.repository.IRepository.IRepository;

import java.util.Set;

public interface SalesPersonRepository extends IRepository<Salesperson,String> {


    Set<Salesperson> getAll();
}
