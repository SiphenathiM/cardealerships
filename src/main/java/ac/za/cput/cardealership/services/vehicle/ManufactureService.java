package ac.za.cput.cardealership.services.vehicle;

import ac.za.cput.cardealership.domain.vehicle.Manufacturer;
import ac.za.cput.cardealership.services.IService.IService;

import java.util.Set;

public interface ManufactureService extends IService<Manufacturer,String> {

    Set<Manufacturer> getAll();
}
