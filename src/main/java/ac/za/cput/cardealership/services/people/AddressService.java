package ac.za.cput.cardealership.services.people;

import ac.za.cput.cardealership.domain.people.Address;
import ac.za.cput.cardealership.services.IService.IService;

import java.util.Set;

public interface AddressService extends IService<Address,String> {

    Set<Address> getAll();
}
