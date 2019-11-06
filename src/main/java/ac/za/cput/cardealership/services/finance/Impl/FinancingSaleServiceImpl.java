package ac.za.cput.cardealership.services.finance.Impl;

import ac.za.cput.cardealership.domain.finance.FinancingSale;
import ac.za.cput.cardealership.services.finance.FinancingSaleService;

import java.util.HashSet;
import java.util.Set;

public class FinancingSaleServiceImpl implements FinancingSaleService {


    private static FinancingSaleServiceImpl repository = null;
    private Set<FinancingSale> financingSales;

    private FinancingSaleServiceImpl(){
        this.financingSales = new HashSet<>();
    }

    public static FinancingSaleServiceImpl getRepository(){
        if (repository == null) repository = new FinancingSaleServiceImpl();
        return repository;
    }

    private FinancingSale search(String period){
        return this.financingSales.stream()
                .filter(financingSales -> financingSales.getTotalPeriod().trim().equals(period ) ).findAny()
                .orElse( null );
    }



    @Override
    public Set<FinancingSale> getAll() {
        return null;
    }

    @Override
    public FinancingSale create(FinancingSale financingSale) {
            this.financingSales.add(financingSale);
            return financingSale;
    }

    @Override
    public FinancingSale update(FinancingSale financingSale) {
        FinancingSale toUpdate = search(financingSale.getTotalPeriod() );
        if(toUpdate != null){
            this.financingSales.remove( toUpdate );
            return create(financingSale);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        FinancingSale financingSale = search( s);
        if(financingSale != null) this.financingSales.remove( s );
    }

    @Override
    public FinancingSale read(String s) {
        FinancingSale financingSale = search( s );
        return financingSale;
    }
}
