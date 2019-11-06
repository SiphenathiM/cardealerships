package ac.za.cput.cardealership.repository.operation;

import ac.za.cput.cardealership.domain.operation.ServiceType;
import ac.za.cput.cardealership.repository.IRepository.IRepository;

import java.util.Set;

public interface ServiceTypeRepository extends IRepository<ServiceType,String> {


    Set<ServiceType> getAll();
}
