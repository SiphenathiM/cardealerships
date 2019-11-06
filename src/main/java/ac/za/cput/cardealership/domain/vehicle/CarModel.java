package ac.za.cput.cardealership.domain.vehicle;

public class CarModel {


    private String name;
    private  double price;

    public CarModel(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public CarModel(Builder builder) {

        this.name= builder.name;
        this.price = builder.price;

    }

    public static class Builder {

        private String name;
        private  double price;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(double  price) {
            this.price = price;
            return this;
        }

        public CarModel build() {
            return new CarModel(this);

        }
    }
}
