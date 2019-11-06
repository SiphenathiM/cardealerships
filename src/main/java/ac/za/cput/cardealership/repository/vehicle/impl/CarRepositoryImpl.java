package ac.za.cput.cardealership.repository.vehicle.impl;

public class CarRepositoryImpl {


   /* private static CarRepository carRepository = null;
    private Set<Car> carDB;

    private CarRepositoryImpl() {
        this.carDB = new HashSet<>();
    }

    public static CarRepository getCarRepository(){
        if(carRepository==null) carRepository = new CarRepositoryImpl();
        return carRepository;
    }


    @Override
    public Car create(Car car) {
        this.carDB.add(car);
        return car;
    }


    @Override
    public Car read(String s) {
        Car c = this.carDB.stream().filter(car -> car.getSerialNumber().equalsIgnoreCase(s)).findAny().orElse(null);
        return  c;
    }


    @Override
    public Car update(Car car) {
        Car p = read(car.getSerialNumber());
        if(p != null){
            this.carDB.remove(p);
            return create(car);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Car c = read(s);
        this.carDB.remove(c);
    }

    @Override
    public Set<Car> getAll() {

        return this.carDB;
    }

    @Override
    public  Car retrieveByDesc(String carDesc){

        return  this.carDB.stream().filter(car -> car.getSerialNumber().equalsIgnoreCase(carDesc)).findAny().orElse(null);
    }*/

}
