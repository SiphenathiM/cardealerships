package ac.za.cput.cardealership.domain.operation;

public class ServiceType {

    private String typeID;
    private String description;
    private double laborcost;


    public String getTypeID() {
        return typeID;
    }

    public String getDescription() {
        return description;
    }

    public double getLaborcost() {
        return laborcost;
    }

    public ServiceType(Builder builder) {

        this.typeID= builder.typeID;
        this.description  = builder.description ;
        this.laborcost  = builder.laborcost ;

    }
    public static class Builder {

        private String typeID;
        private String description;
        private double laborcost;


        public Builder typeID(String typeID) {
            this.typeID = typeID;
            return this;
        }
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder laborcost(double laborcost) {
            this.laborcost = laborcost;
            return this;
        }

        public ServiceType build() {
            return new ServiceType(this);

        }
    }
}
