package ac.za.cput.cardealership.domain.finance;

public class Sale {

    private String date;


    public String getDate() {
        return date;
    }

    public Sale(Builder builder) {
        this.date = date;
    }

    public static class Builder {
        private String date;

        public Builder date(int discount) {
            this.date = date;
            return this;
        }

        public Sale build() {
            return new Sale(this);
        }
    }
}
