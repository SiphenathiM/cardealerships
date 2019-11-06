package ac.za.cput.cardealership.repository.vehicle;

import ac.za.cput.cardealership.domain.vehicle.Manufacturer;
import ac.za.cput.cardealership.repository.IRepository.IRepository;

import java.util.Set;

public interface ManufacturerRepository extends IRepository<Manufacturer,String> {

    Set<Manufacturer> getAll();
}
