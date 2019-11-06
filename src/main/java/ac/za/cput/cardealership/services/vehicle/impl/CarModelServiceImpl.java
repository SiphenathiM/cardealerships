package ac.za.cput.cardealership.services.vehicle.impl;

import ac.za.cput.cardealership.domain.vehicle.CarModel;
import ac.za.cput.cardealership.repository.vehicle.CarModelRepository;
import ac.za.cput.cardealership.repository.vehicle.impl.CarModelRepositoryImpl;
import ac.za.cput.cardealership.services.vehicle.CarModelService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CarModelServiceImpl implements CarModelService {

    private  static  CarModelService carModelService=null;
    private CarModelRepository carModelRepository;

    private CarModelServiceImpl(){

        this.carModelRepository = CarModelRepositoryImpl.getCarModelRepository();
    }

    public  static CarModelService getRepository(){

        if (carModelService==null) carModelService = new CarModelServiceImpl();
        return  carModelService;
    }

    @Override
    public Set<CarModel> getAll() {
        return this.carModelRepository.getAll();
    }

    @Override
    public CarModel create(CarModel carModel) {
        return this.carModelRepository.create(carModel);
    }

    @Override
    public CarModel update(CarModel carModel) {
        return this.carModelRepository.update(carModel);
    }

    @Override
    public void delete(String s) {

        this.carModelRepository.delete(s);

    }

    @Override
    public CarModel read(String s) {
        return this.carModelRepository.read(s);
    }
}
