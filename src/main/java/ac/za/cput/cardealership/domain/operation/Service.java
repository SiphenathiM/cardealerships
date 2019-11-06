package ac.za.cput.cardealership.domain.operation;

public class Service {

    private String serviceID;
    private String serviceName;
    private double hourlyRate;

    public String getServiceID() {
        return serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public Service(Builder builder) {

        this.serviceID= builder.serviceID;
        this.serviceName  = builder.serviceName ;
        this.hourlyRate = builder.hourlyRate ;
    }
    public static class Builder {

        private String serviceID;
        private String serviceName;
        private double hourlyRate;

        public Builder serviceID(String serviceID) {
            this.serviceID = serviceID;
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Builder hourlyRate(double hourlyRate) {
            this.hourlyRate = hourlyRate;
            return this;
        }

        public Service build() {
            return new Service(this);

        }
    }
}
