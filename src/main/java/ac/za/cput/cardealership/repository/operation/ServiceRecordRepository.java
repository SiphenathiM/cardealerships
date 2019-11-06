package ac.za.cput.cardealership.repository.operation;

import ac.za.cput.cardealership.domain.operation.ServiceRecord;
import ac.za.cput.cardealership.repository.IRepository.IRepository;

import java.util.Set;

public interface ServiceRecordRepository extends IRepository<ServiceRecord,String> {

    Set<ServiceRecord> getAll();
}
