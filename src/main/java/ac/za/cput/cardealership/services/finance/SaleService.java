package ac.za.cput.cardealership.services.finance;

import ac.za.cput.cardealership.domain.finance.Sale;
import ac.za.cput.cardealership.services.IService.IService;

import java.util.Set;

public interface SaleService extends IService<Sale,String> {

    Set<Sale> getAll();


}
