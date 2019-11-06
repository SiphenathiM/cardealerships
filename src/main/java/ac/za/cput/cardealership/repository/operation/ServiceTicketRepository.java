package ac.za.cput.cardealership.repository.operation;

import ac.za.cput.cardealership.domain.operation.ServiceTicket;
import ac.za.cput.cardealership.repository.IRepository.IRepository;

import java.util.Set;

public interface ServiceTicketRepository extends IRepository<ServiceTicket,String> {


    Set<ServiceTicket> getAll();
}
