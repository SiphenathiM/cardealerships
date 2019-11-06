package ac.za.cput.cardealership.domain.people;

public class City {

   private String cityZipCode;
    private String cityName;

    public City(String cityZipCode, String cityName) {
        this.cityZipCode = cityZipCode;
        this.cityName = cityName;
    }

    public String getCityZipCode() {
        return cityZipCode;
    }

    public String getCityName() {
        return cityName;
    }
    public City(Builder builder) {

        this.cityZipCode= builder.cityZipCode;
        this.cityName  = builder.cityName ;

    }
    public static class Builder {

        private String cityZipCode;
        private String cityName;


        public Builder cityZipCode(String cityZipCode) {
            this.cityZipCode = cityZipCode;
            return this;
        }

        public Builder cityName(String cityName) {
            this.cityName = cityName;
            return this;
        }

        public City build() {
            return new City(this);

        }
    }
}
