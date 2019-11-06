package ac.za.cput.cardealership.repository.vehicle;

import ac.za.cput.cardealership.domain.vehicle.CarModel;
import ac.za.cput.cardealership.repository.IRepository.IRepository;

import java.util.Set;

public interface CarModelRepository extends IRepository<CarModel,String> {
    Set<CarModel> getAll();
}
