package ac.za.cput.cardealership.services.finance.Impl;

import ac.za.cput.cardealership.domain.finance.SalesInvoice;
import ac.za.cput.cardealership.services.finance.SalesInvoiceService;

import java.util.HashSet;
import java.util.Set;

public class SalesInvoiceServiceImpl implements SalesInvoiceService {

    private static SalesInvoiceServiceImpl repository = null;
    private Set<SalesInvoice> salesInvoices;

    private SalesInvoiceServiceImpl() {
        this.salesInvoices = new HashSet<>();
    }

    public static SalesInvoiceServiceImpl getRepository() {
        if (repository == null) repository = new SalesInvoiceServiceImpl();
        return repository;
    }

    private SalesInvoice search(String sale) {
        return this.salesInvoices.stream()
                .filter(salesInvoices -> salesInvoices.getInvoiceID().equals(sale))
                .findAny()
                .orElse(null);
    }


    @Override
    public Set<SalesInvoice> getAll() {
        return null;
    }

    @Override
    public SalesInvoice create(SalesInvoice salesInvoice) {
        this.salesInvoices.add(salesInvoice);
        return salesInvoice;
    }

    @Override
    public SalesInvoice update(SalesInvoice salesInvoice) {
        SalesInvoice toUpdate = search(salesInvoice.getInvoiceID() );
        if(toUpdate != null){
            this.salesInvoices.remove( toUpdate );
            return create(salesInvoice);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        SalesInvoice sale = search( s);
        if(sale != null) this.salesInvoices.remove( sale );
    }

    @Override
    public SalesInvoice read(String s) {
        SalesInvoice sale = search( s );
        return sale;
    }
}
