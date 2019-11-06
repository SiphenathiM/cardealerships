package ac.za.cput.cardealership.services.people;

import ac.za.cput.cardealership.domain.people.Mechanic;
import ac.za.cput.cardealership.services.IService.IService;

import java.util.Set;

public interface MechanicService extends IService<Mechanic,String> {

    Set<Mechanic> getAll();


}
