package ac.za.cput.cardealership.services.vehicle;

import ac.za.cput.cardealership.domain.vehicle.CarModel;
import ac.za.cput.cardealership.services.IService.IService;

import java.util.Set;

public interface CarModelService extends IService<CarModel,String> {

    Set<CarModel> getAll();
}
