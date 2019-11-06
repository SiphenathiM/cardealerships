package ac.za.cput.cardealership.services.people.impl;

import ac.za.cput.cardealership.domain.people.City;
import ac.za.cput.cardealership.repository.people.CityRepository;
import ac.za.cput.cardealership.repository.people.impl.CityRepositoryImpl;
import ac.za.cput.cardealership.services.people.CityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CityServiceImpl implements CityService {


    private static CityService cityService = null;
    private CityRepository cityRepository;

    private CityServiceImpl(){
        this.cityRepository= CityRepositoryImpl.getCityRepository();
    }

    public static CityService getRepository(){
        if (cityService == null) cityService = new CityServiceImpl();
        return cityService;
    }


    @Override
    public City create(City city) {
    return  this.cityRepository.create(city);
    }

    @Override
    public City read(String s) {
   return this.cityRepository.read(s);
    }

    @Override
    public City update(City city) {
        return  this.cityRepository.update(city);
    }

    @Override
    public void delete(String s) {
        this.cityRepository.delete(s);
    }

    @Override
    public Set<City> getAll() {
        return this.cityRepository.getAll();
    }
}
