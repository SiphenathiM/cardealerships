package ac.za.cput.cardealership.repository.vehicle.impl;

import ac.za.cput.cardealership.domain.vehicle.CarModel;
import ac.za.cput.cardealership.repository.vehicle.CarModelRepository;

import java.util.HashSet;
import java.util.Set;

public class CarModelRepositoryImpl implements CarModelRepository {

    private static CarModelRepository carModelRepository;

    private Set<CarModel> carModelDB;

    private CarModelRepositoryImpl() {
        this.carModelDB = new HashSet<>();
    }

    public static CarModelRepository getCarModelRepository(){
        if(carModelRepository==null)
            carModelRepository = new CarModelRepositoryImpl();
        return carModelRepository;
    }



    @Override
    public CarModel create(CarModel model) {
        this.carModelDB.add(model);
        return model;
    }

    @Override
    public CarModel read(String s) {

        CarModel c =this.carModelDB.stream().filter(carModel ->carModel.getName().equalsIgnoreCase(s)).findAny().orElse(null);
        return  c;
    }

    @Override
    public CarModel update(CarModel model) {
        CarModel c = read(model.getName());
        if (c!=null){
            this.carModelDB.remove(c);
            return create(model);
        }

        return  null;
    }

    @Override
    public void delete(String s) {
        CarModel c = read(s);
        this.carModelDB.remove(c);
    }

    @Override
    public Set<CarModel> getAll() {
        return this.carModelDB;
    }
}
