package ac.za.cput.cardealership.factory.product;

import ac.za.cput.cardealership.domain.product.Part;
import ac.za.cput.cardealership.util.Misc;

public class PartFactory {


    public static Part getPart(int partNumber, String description, double price){
        return new Part.Builder().partID(Misc.generatedId())
                .partNumber(partNumber)
                .description(description)
                .price(price)
                .build();
    }

}
