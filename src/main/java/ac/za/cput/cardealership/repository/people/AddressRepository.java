package ac.za.cput.cardealership.repository.people;

import ac.za.cput.cardealership.domain.people.Address;
import ac.za.cput.cardealership.repository.IRepository.IRepository;

import java.util.Set;

public  interface AddressRepository extends IRepository<Address,String> {
    Set<Address> getAll();

}
