package ac.za.cput.cardealership.services.vehicle.impl;

import ac.za.cput.cardealership.domain.vehicle.Manufacturer;
import ac.za.cput.cardealership.repository.vehicle.ManufacturerRepository;
import ac.za.cput.cardealership.repository.vehicle.impl.ManufacturerRepositoryImpl;
import ac.za.cput.cardealership.services.vehicle.ManufactureService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ManufactureServiceImpl implements ManufactureService {

    private static ManufactureService manufactureService=null;
    private ManufacturerRepository manufacturerRepository;

    private ManufactureServiceImpl(){

        this.manufacturerRepository = ManufacturerRepositoryImpl.getManufacturerRepository();
    }

    public  static ManufactureService getRepository(){

        if (manufactureService==null) manufactureService = new ManufactureServiceImpl();
        return manufactureService;
    }

    @Override
    public Manufacturer create(Manufacturer manufacturer) {
        return this.manufacturerRepository.create(manufacturer);
    }

    @Override
    public Manufacturer update(Manufacturer manufacturer) {
        return this.manufacturerRepository.update(manufacturer);
    }

    @Override
    public void delete(String s) {

        this.manufacturerRepository.delete(s);

    }

    @Override
    public Manufacturer read(String s) {
        return this.read(s);
    }

    @Override
    public Set<Manufacturer> getAll() {
        return this.manufacturerRepository.getAll();
    }
}
