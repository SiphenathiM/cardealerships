package ac.za.cput.cardealership.services.people;

import ac.za.cput.cardealership.domain.people.Salesperson;
import ac.za.cput.cardealership.services.IService.IService;

import java.util.Set;

public interface SalesPersonService extends IService<Salesperson,String> {


    Set<Salesperson> getAll();
}
