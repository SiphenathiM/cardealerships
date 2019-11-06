package ac.za.cput.cardealership.services.product;

import ac.za.cput.cardealership.domain.product.Part;

public interface PartService {

    Part create(Part part);

    Part read(String partID);

    Part update(Part part);

    void delete(String partID);
}
