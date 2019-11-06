package ac.za.cput.cardealership.domain.vehicle;

public class Manufacturer {

    private String name;
    private String address;

    public Manufacturer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Manufacturer(Builder builder) {

        this.name= builder.name;
        this.address  = builder.address ;

    }
    public static class Builder {

        private String name;
        private String address;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Manufacturer build() {
            return new Manufacturer(this);

        }
    }
}
