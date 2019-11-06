package ac.za.cput.cardealership.services.finance.Impl;

import ac.za.cput.cardealership.domain.finance.Sale;
import ac.za.cput.cardealership.services.finance.SaleService;

import java.util.HashSet;
import java.util.Set;

public class SaleServiceImpl implements SaleService {


    private static SaleServiceImpl repository = null;
    private Set<Sale> sales;

    private SaleServiceImpl() {
        this.sales = new HashSet<>();
    }

    public static SaleServiceImpl getRepository() {
        if (repository == null) repository = new SaleServiceImpl();
        return repository;
    }

    private Sale search(String date) {
        return this.sales.stream()
                .filter(sales -> sales.getDate().trim().equals(date))
                .findAny()
                .orElse(null);
    }


    @Override
    public Set<Sale> getAll() {
        return null;
    }

    @Override
    public Sale create(Sale sale) {
        this.sales.add(sale);
        return sale;
    }

    @Override
    public Sale update(Sale sale) {
        Sale toUpdate = search(sale.getDate() );
        if(toUpdate != null){
            this.sales.remove( toUpdate );
            return create(sale);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Sale sale = search( s);
        if(sale != null) this.sales.remove( sale );
    }

    @Override
    public Sale read(String s) {
        Sale sale = search( s );
        return sale;
    }
}
