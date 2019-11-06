package ac.za.cput.cardealership.services.people.impl;

import ac.za.cput.cardealership.domain.people.Salesperson;
import ac.za.cput.cardealership.services.people.SalesPersonService;

import java.util.HashSet;
import java.util.Set;

public class SalesPersonServiceImpl implements SalesPersonService {

    private static SalesPersonServiceImpl repository = null;
    private Set<Salesperson> salesPeople;

    private SalesPersonServiceImpl(){
        this.salesPeople = new HashSet<>();
    }

    public static SalesPersonServiceImpl getRepository(){
        if (repository == null) repository = new SalesPersonServiceImpl();
        return repository;
    }

    private Salesperson search(String id){
        return this.salesPeople.stream()
                .filter(salesPeople -> salesPeople.getId().trim().equals( id ) )
                .findAny()
                .orElse( null );
    }


    @Override
    public Set<Salesperson> getAll() {
        return null;
    }

    @Override
    public Salesperson create(Salesperson salesperson) {
        this.salesPeople.add(salesperson);
        return salesperson;
    }

    @Override
    public Salesperson update(Salesperson salesperson) {
        Salesperson toUpdate = search(salesperson.getId() );
        if(toUpdate != null){
            this.salesPeople.remove( toUpdate );
            return create(salesperson );
        }
        return null;
    }

    @Override
    public void delete(String id) {
        Salesperson salesperson = search( id);
        if(salesperson != null) this.salesPeople.remove( salesperson );

    }

    @Override
    public Salesperson read(String id) {
        Salesperson salesperson = search( id);
        return salesperson;
    }
}
