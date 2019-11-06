package ac.za.cput.cardealership.factory.operation;

import ac.za.cput.cardealership.domain.operation.Service;
import ac.za.cput.cardealership.util.Misc;

public class ServiceFactory {


    public static Service getService(String serviceName, double hourlyRate){
        return new Service.Builder().serviceID(Misc.generatedId())
                .serviceName(serviceName)
                .hourlyRate(hourlyRate)
                .build();
    }
}
