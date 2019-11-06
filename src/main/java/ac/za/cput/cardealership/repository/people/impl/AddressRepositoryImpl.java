package ac.za.cput.cardealership.repository.people.impl;

import ac.za.cput.cardealership.domain.people.Address;
import ac.za.cput.cardealership.repository.people.AddressRepository;

import java.util.HashSet;
import java.util.Set;


public class AddressRepositoryImpl implements AddressRepository {

  private static AddressRepository addressRepository;

  private Set<Address>  addressDB;

  private  AddressRepositoryImpl(){
      this.addressDB= new HashSet<>();
  }

  public  static AddressRepository getAddressRepository(){
      if (addressRepository==null) addressRepository=new AddressRepositoryImpl();
      return addressRepository;
  }


    @Override
    public Address create(Address address) {
        this.addressDB.add(address);
         return address;
    }

    @Override
    public Address read(String s) {
        return this.addressDB.stream().filter(address -> address.getNumber().equalsIgnoreCase(s)).findAny().orElse(null);
    }

    @Override
    public Address update(Address address) {
        Address a = read(address.getNumber());
        if (a!=null){
            delete(a.getNumber());
            return create(address);
        }
        return null;
    }

    @Override
    public void delete(String s) {
      Address address = read(s);
      this.addressDB.remove(address);
  }


    @Override
    public Set<Address> getAll() {
        return  this.addressDB;
    }
}
