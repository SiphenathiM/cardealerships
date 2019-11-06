package ac.za.cput.cardealership.repository.finance;

import ac.za.cput.cardealership.domain.finance.Sale;
import ac.za.cput.cardealership.repository.IRepository.IRepository;

import java.util.Set;

public interface SaleRepository extends IRepository<Sale,String> {

    Set<Sale> getAll();


}
