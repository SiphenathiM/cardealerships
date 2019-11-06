package ac.za.cput.cardealership.repository.vehicle.impl;

import ac.za.cput.cardealership.domain.vehicle.Manufacturer;
import ac.za.cput.cardealership.repository.vehicle.ManufacturerRepository;

import java.util.HashSet;
import java.util.Set;

public class ManufacturerRepositoryImpl implements ManufacturerRepository {
    private static ManufacturerRepository manufacturerRepository;
    private  Set<Manufacturer> manufacturerDB;

    private ManufacturerRepositoryImpl(){
        this.manufacturerDB = new HashSet<>();
    }

    public  static  ManufacturerRepository getManufacturerRepository(){

        if (manufacturerRepository==null) manufacturerRepository= new ManufacturerRepositoryImpl();
        return manufacturerRepository;
    }



    @Override
    public Set<Manufacturer> getAll() {
        return this.manufacturerDB;
    }

    @Override
    public Manufacturer create(Manufacturer manufacturer) {
        this.manufacturerDB.add(manufacturer);
        return manufacturer;
    }

    @Override
    public Manufacturer update(Manufacturer manufacturer) {
        Manufacturer m = read(manufacturer.getName());
        if (m!=null){
            this.manufacturerDB.remove(m);
            return  create(manufacturer);
        }

        return null;
    }

    @Override
    public void delete(String s) {

        Manufacturer m = read(s);
        this.manufacturerDB.remove(m);

    }

    @Override
    public Manufacturer read(String s) {
        Manufacturer m = this.manufacturerDB.stream().filter(manufacturer -> manufacturer.getName().equalsIgnoreCase(s)).findAny().orElse(null);
        return  m;
    }
}
