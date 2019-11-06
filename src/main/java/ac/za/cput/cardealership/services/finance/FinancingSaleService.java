package ac.za.cput.cardealership.services.finance;

import ac.za.cput.cardealership.domain.finance.FinancingSale;
import ac.za.cput.cardealership.services.IService.IService;

import java.util.Set;

public interface FinancingSaleService extends IService<FinancingSale,String> {

    Set<FinancingSale> getAll();
}
