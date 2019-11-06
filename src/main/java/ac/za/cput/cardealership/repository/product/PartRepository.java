package ac.za.cput.cardealership.repository.product;

import ac.za.cput.cardealership.domain.product.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface PartRepository extends JpaRepository<Part,String> {

}
