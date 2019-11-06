package ac.za.cput.cardealership.services.people.impl;

import ac.za.cput.cardealership.domain.people.Address;
import ac.za.cput.cardealership.repository.people.AddressRepository;
import ac.za.cput.cardealership.repository.people.impl.AddressRepositoryImpl;
import ac.za.cput.cardealership.services.people.AddressService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AddressServiceImpl implements AddressService {

   private static AddressService addressService=null;
   private AddressRepository addressRepository;

   private AddressServiceImpl(){
       this.addressRepository= AddressRepositoryImpl.getAddressRepository();
   }


    public static AddressService getRepository(){
        if ( addressService== null) addressService = new AddressServiceImpl();
        return addressService;
    }

    @Override
    public Address create(Address address) {
        return this.addressRepository.create(address);
    }


    @Override
    public Address read(String s) {
        return  this.addressRepository.read(s);
    }

    @Override
    public Address update(Address address) {
      return  this.addressRepository.update(address);
    }

    @Override
    public void delete(String s) {
         this.addressRepository.delete(s);
    }


    @Override
    public Set<Address> getAll() {

       return this.addressRepository.getAll();
    }
}
