package ac.za.cput.cardealership.repository.operation;

import ac.za.cput.cardealership.domain.operation.Service;
import ac.za.cput.cardealership.repository.IRepository.IRepository;

import java.util.Set;

public interface ServiceRepository extends IRepository<Service,String>{

    Set<Service> getAll();
}
