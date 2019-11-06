package ac.za.cput.cardealership.domain.vehicle;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {

     @Id
     @Column(name= "id")
     private String id;
     @Column(name = "name")
     private String name;
     @Column(name= "kmTraveled")
     private String kmTraveled;


    public Car()  {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getKmTraveled() {
        return kmTraveled;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKmTraveled(String kmTraveled) {
        this.kmTraveled = kmTraveled;
    }

    public Car(Builder builder) {

        this.id = builder.id;
        this.name=builder.name;
        this.kmTraveled = builder.kmTraveled;

    }

    public static class Builder {

        private String id;
        private  String name;
        private String kmTraveled;


        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder kmTraveled(String kmTraveled) {
            this.kmTraveled = kmTraveled;
            return this;
        }

        public Car build() {
            return new Car(this);

        }
    }
}