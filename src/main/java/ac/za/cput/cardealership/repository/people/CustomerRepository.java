package ac.za.cput.cardealership.repository.people;

import ac.za.cput.cardealership.domain.people.Customer;
import ac.za.cput.cardealership.repository.IRepository.IRepository;

import java.util.Set;

public interface CustomerRepository extends IRepository<Customer,String> {

    Set<Customer> getAll();
}
