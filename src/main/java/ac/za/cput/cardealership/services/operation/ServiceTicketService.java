package ac.za.cput.cardealership.services.operation;

import ac.za.cput.cardealership.domain.operation.ServiceTicket;

public interface ServiceTicketService {


    ServiceTicket create(ServiceTicket service);

    ServiceTicket read(String serviceTicketID);

    ServiceTicket update(ServiceTicket service);

    void delete(String serviceTicketID);
}
