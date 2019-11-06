package ac.za.cput.cardealership.factory.operation;

import ac.za.cput.cardealership.domain.operation.ServiceType;
import ac.za.cput.cardealership.util.Misc;

;


public class ServiceTypeFactory {

    public static ServiceType getServiceType(String description, double laborcost){
        return new ServiceType.Builder().typeID(Misc.generatedId())
                .description(description)
                .laborcost(laborcost)
                .build();
    }
}
