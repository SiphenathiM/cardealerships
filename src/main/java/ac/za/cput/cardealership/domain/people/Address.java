package ac.za.cput.cardealership.domain.people;

public class Address {

    private String street;
    private String number;

    public Address(String street, String number) {
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public Address(Builder builder) {

        this.street = builder.street;
        this.number = builder.number;

    }

    public static class Builder {

        private String street;
        private String number;


        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder number(String number) {
            this.number = number;
            return this;
        }

        public Address build() {
            return new Address(this);

        }
    }
}
