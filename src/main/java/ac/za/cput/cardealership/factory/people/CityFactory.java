package ac.za.cput.cardealership.factory.people;

import ac.za.cput.cardealership.domain.people.City;

public class CityFactory {

    public static City getCity(String cityZipCode, String cityName){
        return new City.Builder().cityZipCode(cityZipCode)
                .cityName(cityName)
                .build();
    }
}
