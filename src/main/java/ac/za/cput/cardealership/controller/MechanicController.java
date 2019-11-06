package ac.za.cput.cardealership.controller;


import ac.za.cput.cardealership.domain.people.Mechanic;
import ac.za.cput.cardealership.factory.people.MechanicFactory;
import ac.za.cput.cardealership.services.people.impl.MechanicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/cardealrship/mechanic")
public class MechanicController {

    @Autowired
    private MechanicServiceImpl service;

    @GetMapping("/create/{lastname}")
    public @ResponseBody
    Mechanic create (@PathVariable String fistname, String lastname){
        Mechanic mechanic = MechanicFactory.getMechanic(fistname,lastname);
        return service.create(mechanic);

    }

    @GetMapping("/getall")
    @ResponseBody

    public Set<Mechanic> getAll(){
        return service.getAll();
    }
}
