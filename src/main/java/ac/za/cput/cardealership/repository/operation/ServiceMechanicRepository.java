package ac.za.cput.cardealership.repository.operation;

import ac.za.cput.cardealership.domain.operation.ServiceMechanic;
import ac.za.cput.cardealership.repository.IRepository.IRepository;

import java.util.Set;

public interface ServiceMechanicRepository extends IRepository<ServiceMechanic,String> {

    Set<ServiceMechanic> getAll();
}
