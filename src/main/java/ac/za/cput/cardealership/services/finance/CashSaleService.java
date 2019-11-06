package ac.za.cput.cardealership.services.finance;


import ac.za.cput.cardealership.domain.finance.CashSale;
import ac.za.cput.cardealership.services.IService.IService;

import java.util.Set;


public interface CashSaleService extends IService<CashSale,String> {

    Set<CashSale> getAll();
}
