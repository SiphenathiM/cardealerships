package ac.za.cput.cardealership.controller.vehicle;

import ac.za.cput.cardealership.domain.vehicle.Car;
import ac.za.cput.cardealership.exception.ResourceNotFoundException;
import ac.za.cput.cardealership.repository.vehicle.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/cars")
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Car> addCar(@RequestBody final  Car car) {
        carRepository.save(car);
        return carRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public List<Car> deleteCar(@PathVariable String id){
        carRepository.deleteById(id);
        return carRepository.findAll();
    }








}
