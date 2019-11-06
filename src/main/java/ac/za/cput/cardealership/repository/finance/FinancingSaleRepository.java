package ac.za.cput.cardealership.repository.finance;

import ac.za.cput.cardealership.domain.finance.FinancingSale;
import ac.za.cput.cardealership.repository.IRepository.IRepository;

import java.util.Set;

public interface FinancingSaleRepository extends IRepository<FinancingSale,String> {

    Set<FinancingSale> getAll();
}
