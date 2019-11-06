package ac.za.cput.cardealership.services.finance;

import ac.za.cput.cardealership.domain.finance.SalesInvoice;
import ac.za.cput.cardealership.services.IService.IService;

import java.util.Set;

public interface SalesInvoiceService extends IService<SalesInvoice,String> {

    Set<SalesInvoice> getAll();
}
