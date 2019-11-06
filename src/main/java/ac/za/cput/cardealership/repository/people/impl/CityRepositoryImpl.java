package ac.za.cput.cardealership.repository.people.impl;

import ac.za.cput.cardealership.domain.people.City;
import ac.za.cput.cardealership.repository.people.CityRepository;

import java.util.HashSet;
import java.util.Set;

public class CityRepositoryImpl implements CityRepository {


    private static CityRepositoryImpl cityRepository;
    private Set<City> cityDB;

    private CityRepositoryImpl(){

        this.cityDB = new HashSet<>();
    }

    public static CityRepository getCityRepository(){
        if (cityRepository == null) cityRepository = new CityRepositoryImpl();
        return cityRepository;
    }

    @Override
    public City create(City city) {
        this.cityDB.add(city);
        return city;
    }

    @Override
    public City read(String s) {
      return  this.cityDB.stream().filter(city -> city.getCityZipCode().equalsIgnoreCase(s)).findAny().orElse(null);
    }

    @Override
    public City update(City city) {

        City c = read(city.getCityZipCode());
        if (c!=null){
            delete(c.getCityZipCode());
        }
        return null; }

    @Override
    public void delete(String s) {
        City city = read(s);
        this.cityDB.remove(city);
    }

    @Override
    public Set<City> getAll() {
        return this.cityDB;

    }
}
