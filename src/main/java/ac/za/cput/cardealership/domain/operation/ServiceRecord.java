package ac.za.cput.cardealership.domain.operation;

public class ServiceRecord {

    private String date;
    private int currentMileage;

    public ServiceRecord(String date, int currentMileage) {
        this.date = date;
        this.currentMileage = currentMileage;
    }

    public String getDate() {
        return date;
    }

    public int getCurrentMileage() {
        return currentMileage;
    }

    public ServiceRecord(Builder builder) {

        this.date= builder.date;
        this.currentMileage  = builder.currentMileage ;

    }
    public static class Builder {

        private String date;
        private int currentMileage;

        public Builder date(String date) {
            this.date = date;
            return this;
        }
        public Builder currentMileage(int currentMileage) {
            this.currentMileage = currentMileage;
            return this;
        }

        public ServiceRecord build() {
            return new ServiceRecord(this);

        }
    }
}
