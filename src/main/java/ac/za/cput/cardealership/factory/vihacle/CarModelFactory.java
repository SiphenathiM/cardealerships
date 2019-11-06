package ac.za.cput.cardealership.factory.vihacle;


import ac.za.cput.cardealership.domain.vehicle.CarModel;

public class CarModelFactory {

    public static CarModel getCarModel(String name, double price){
        return new CarModel.Builder().name(name)
                .price(price)
                .build();
    }

}
