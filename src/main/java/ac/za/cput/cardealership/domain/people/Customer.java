package ac.za.cput.cardealership.domain.people;

public class Customer {

    private int discount;
    private String type;


    public int getDiscount() {
        return discount;
    }

    public String getType() {
        return type;
    }

      public Customer(Builder builder) {
        this.discount = discount;
        this.type = type;
    }

    public static class Builder {

        private int discount;
        private String type;


        public Builder discount(int discount) {
            this.discount = discount;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
