package ac.za.cput.cardealership.controller;

import ac.za.cput.cardealership.domain.product.Part;
import ac.za.cput.cardealership.repository.product.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/part")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class PartController {

    @Autowired
    private PartRepository partRepository;

    @GetMapping("/all")
    public List<Part> getAllParts() {
        return partRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Part> persist(@RequestBody final  Part part) {
        partRepository.save(part);
        return partRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public List<Part> deletePart(@PathVariable String id){
        partRepository.deleteById(id);
        return partRepository.findAll();
    }
}
