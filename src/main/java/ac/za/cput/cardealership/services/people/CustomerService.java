package ac.za.cput.cardealership.services.people;

import ac.za.cput.cardealership.domain.people.Customer;
import ac.za.cput.cardealership.services.IService.IService;

import java.util.Set;

public interface CustomerService extends IService<Customer,String> {

    Set<Customer> getAll();
}
