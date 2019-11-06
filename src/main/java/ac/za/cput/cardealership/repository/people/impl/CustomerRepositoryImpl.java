package ac.za.cput.cardealership.repository.people.impl;

import ac.za.cput.cardealership.domain.people.Customer;
import ac.za.cput.cardealership.repository.people.CustomerRepository;

import java.util.HashSet;
import java.util.Set;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static CustomerRepository customerRepository;
    private Set<Customer> customerDB;

    private CustomerRepositoryImpl(){
        this.customerDB = new HashSet<>();
    }

    public static CustomerRepository getCustomerRepository(){
        if (customerRepository == null) customerRepository = new CustomerRepositoryImpl();
        return customerRepository;
    }


    @Override
    public Customer create(Customer customer) {
        this.customerDB.add(customer);
        return customer;
    }

    @Override
    public Customer read(String s) {
       return this.customerDB.stream().filter(customer -> customer.getType().equalsIgnoreCase(s)).findAny().orElse(null);
    }

    @Override
    public Customer update(Customer customer) {
        Customer c =read(customer.getType() );
        if(c != null){
            delete(c.getType());
            return create(customer);
        }
        return null;
    }

    @Override
    public void delete(String  s) {
        Customer c = read(s);
        this.customerDB.remove(c);
    }


    @Override
    public Set<Customer> getAll() {
        return this.customerDB;
    }
}
