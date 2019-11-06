package ac.za.cput.cardealership.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = {"/", "/cardealership"})
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Welcome to Cardealership App!", HttpStatus.OK);
    }
}
