package ac.za.cput.cardealership.services.vehicle;

import ac.za.cput.cardealership.domain.vehicle.Car;
import ac.za.cput.cardealership.services.IService.IService;

import java.util.Set;

public interface CarService extends IService<Car,String> {

    Set<Car> getAll();

    Car retrieveByDesc(String careDesc);
}
