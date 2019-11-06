package ac.za.cput.cardealership.repository.people.impl;

import ac.za.cput.cardealership.domain.people.Mechanic;
import ac.za.cput.cardealership.repository.people.MechanicRepository;

import java.util.HashSet;
import java.util.Set;

public class MechanicRepositoryImpl implements MechanicRepository {

    private static MechanicRepositoryImpl repository = null;
    private Set<Mechanic> mechanic;

    private MechanicRepositoryImpl(){
        this.mechanic = new HashSet<>();
    }

    public static MechanicRepositoryImpl getRepository(){
        if (repository == null) repository = new MechanicRepositoryImpl();
        return repository;
    }

    private Mechanic search(String mechanicID){
        return this.mechanic.stream()
                .filter(mechanic -> mechanic.getMechanicID().trim().equals( mechanicID ) )
                .findAny()
                .orElse( null );
    }


    @Override
    public Set<Mechanic> getAll() {
        return null;
    }

    @Override
    public Mechanic create(Mechanic mechanic) {
        this.mechanic.add(mechanic);
        return mechanic;
    }

    @Override
    public Mechanic update(Mechanic mechanic) {
        Mechanic toUpdate = search(mechanic.getMechanicID() );
        if(toUpdate != null){
            this.mechanic.remove( toUpdate );
            return create(mechanic );
        }
        return null;
    }

    @Override
    public void delete(String Id) {

        Mechanic mechanic = search( Id);
        if(mechanic != null) this.mechanic.remove( mechanic );

    }

    @Override
    public Mechanic read(String id ) {
        Mechanic mechanic = search( id );
        return mechanic;
    }
}
