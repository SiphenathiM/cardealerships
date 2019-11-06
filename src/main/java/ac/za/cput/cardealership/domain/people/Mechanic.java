package ac.za.cput.cardealership.domain.people;

public class Mechanic {


    private String mechanicID;
    private String firstName;
    private String lastName;

    public String getMechanicID() {
        return mechanicID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Mechanic(Builder builder) {

        this.mechanicID = builder.mechanicID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public static class Builder {

        private String mechanicID;
        private String firstName;
        private String lastName;


        public Builder mechanicID (String mechanicID) {
            this.mechanicID = mechanicID;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Mechanic build() {
            return new Mechanic(this);

        }
    }
}
