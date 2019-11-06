package ac.za.cput.cardealership.services.people.impl;

import ac.za.cput.cardealership.domain.people.Customer;
import ac.za.cput.cardealership.repository.people.CustomerRepository;
import ac.za.cput.cardealership.repository.people.impl.CustomerRepositoryImpl;
import ac.za.cput.cardealership.services.people.CustomerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CustomerServiceImpl implements CustomerService {

    private static CustomerService   customerService = null;
    private CustomerRepository customerRepository;

    private CustomerServiceImpl(){

        this.customerRepository= CustomerRepositoryImpl.getCustomerRepository();
    }

    public static CustomerService getRepository(){
        if (customerService == null) customerService = new CustomerServiceImpl();
        return customerService;
    }

    @Override
    public Customer create(Customer customer) {
        return this.customerRepository.create(customer);
    }

    @Override
    public Customer read(String s) {
        return this.customerRepository.read(s);
    }

    @Override
    public Customer update(Customer customer) {
       return this.customerRepository.update(customer);
    }

    @Override
    public void delete(String s) {
        this.customerRepository.delete(s);
    }

    @Override
    public Set<Customer> getAll() {
        return this.customerRepository.getAll();
    }
}
