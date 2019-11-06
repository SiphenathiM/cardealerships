package ac.za.cput.cardealership.repository.finance;


import ac.za.cput.cardealership.domain.finance.CashSale;
import ac.za.cput.cardealership.repository.IRepository.IRepository;

import java.util.Set;


public interface CashSaleRepository extends IRepository<CashSale,String> {

    Set<CashSale> getAll();
}
