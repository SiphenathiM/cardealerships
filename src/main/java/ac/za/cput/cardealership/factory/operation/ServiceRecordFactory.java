package ac.za.cput.cardealership.factory.operation;

import ac.za.cput.cardealership.domain.operation.ServiceRecord;

public class ServiceRecordFactory {

    public static ServiceRecord getServiceRecord(String date, int currentMileage){
        return new ServiceRecord.Builder()
                .date(date)
                .currentMileage(currentMileage)
                .build();
    }
}
