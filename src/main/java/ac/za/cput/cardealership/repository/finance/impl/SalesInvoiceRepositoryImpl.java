package ac.za.cput.cardealership.repository.finance.impl;

import ac.za.cput.cardealership.domain.finance.SalesInvoice;
import ac.za.cput.cardealership.domain.people.Salesperson;
import ac.za.cput.cardealership.repository.finance.SalesInvoiceRepository;

import java.util.HashSet;
import java.util.Set;

public class SalesInvoiceRepositoryImpl implements SalesInvoiceRepository {

    private static SalesInvoiceRepositoryImpl repository = null;
    private Set<SalesInvoice> salesInvoices;

    private SalesInvoiceRepositoryImpl() {
        this.salesInvoices = new HashSet<>();
    }

    public static SalesInvoiceRepositoryImpl getRepository() {
        if (repository == null) repository = new SalesInvoiceRepositoryImpl();
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
    public Salesperson update(Salesperson salesperson) {
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
