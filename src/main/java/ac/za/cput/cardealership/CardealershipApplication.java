package ac.za.cput.cardealership;

import ac.za.cput.cardealership.domain.vehicle.Car;
import ac.za.cput.cardealership.repository.vehicle.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.stream.Stream;

@EnableJpaRepositories(basePackages = "ac.za.cput.cardealership.repository")
@SpringBootApplication
public class CardealershipApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardealershipApplication.class, args);
	}

	@Bean
	CommandLineRunner init(CarRepository carRepository) {
		return args -> {
			Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
				Car car = new Car(name, name.toLowerCase() + "@domain.com");
				carRepository.save(car);
			});
			carRepository.findAll().forEach(System.out::println);


		};
	}

	}