package ac.za.cput.cardealership.domain.people;

public class Salesperson extends Person {

    private double salary;
    private String position;

    public Salesperson(Builder builder) {
        this.salary = salary;
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public static class Builder {
        private double salary;
        private String position;

        public Builder salary(double salary) {

            this.salary = salary;
            return this;
        }
        public Builder position(String position) {
            this.position = position;
            return this;
        }


        public Salesperson build() {
            return new Salesperson(this);
        }
    }
}
