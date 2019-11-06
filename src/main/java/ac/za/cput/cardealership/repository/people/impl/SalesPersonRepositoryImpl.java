package ac.za.cput.cardealership.repository.people.impl;

import ac.za.cput.cardealership.domain.people.Salesperson;
import ac.za.cput.cardealership.repository.people.SalesPersonRepository;

import java.util.HashSet;
import java.util.Set;

public class SalesPersonRepositoryImpl implements SalesPersonRepository {

    private static SalesPersonRepositoryImpl repository = null;
    private Set<Salesperson> salesPeople;

    private SalesPersonRepositoryImpl(){
        this.salesPeople = new HashSet<>();
    }

    public static SalesPersonRepositoryImpl getRepository(){
        if (repository == null) repository = new SalesPersonRepositoryImpl();
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
