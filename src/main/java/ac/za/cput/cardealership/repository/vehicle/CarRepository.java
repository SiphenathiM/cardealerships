package ac.za.cput.cardealership.repository.vehicle;

import ac.za.cput.cardealership.domain.vehicle.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,String> {

}
