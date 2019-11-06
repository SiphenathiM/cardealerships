package ac.za.cput.cardealership.domain.operation;

public class ServiceMechanic {

    private String serviceMachenicID;
    private String name;

    public String getServiceMachenicID() {
        return serviceMachenicID;
    }

    public String getName() {
        return name;
    }

    public ServiceMechanic (Builder builder) {

        this.serviceMachenicID= builder.serviceMachenicID;
        this.name  = builder.name ;

    }
    public static class Builder {

        private String serviceMachenicID;
        private String name;

        public Builder serviceMachenicID(String serviceMachenicID) {
            this.serviceMachenicID= serviceMachenicID;
            return this;
        }
        public Builder name  (String name  ) {
            this.name   = name  ;
            return this;
        }


        public ServiceMechanic build() {
            return new ServiceMechanic(this);

        }
    }
}
