package ac.za.cput.cardealership.repository.people;

import ac.za.cput.cardealership.domain.people.Mechanic;
import ac.za.cput.cardealership.repository.IRepository.IRepository;

import java.util.Set;

public interface MechanicRepository extends IRepository<Mechanic,String> {

    Set<Mechanic> getAll();
}
