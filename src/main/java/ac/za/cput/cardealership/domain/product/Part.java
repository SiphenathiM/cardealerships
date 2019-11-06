package ac.za.cput.cardealership.domain.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "part")
public class Part {

    @Id
    @Column(name = "id")
    private String partID;
    @Column(name = "part_Number")
    private int partNumber;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private double price;

    public Part()  {
    }

    public String getPartID() {
        return partID;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public Part(Builder builder) {

        this.partID= builder.partID;
        this.partNumber  = builder.partNumber ;
        this.description  = builder.description ;
        this.price  = builder.price ;

    }
    public static class Builder {

        private String partID;
        private int partNumber;
        private String description;
        private double price;


        public Builder partID(String partID) {
            this.partID = partID;
            return this;
        }
        public Builder partNumber(int partNumber) {
            this.partNumber = partNumber;
            return this;
        }
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Part build() {
            return new Part(this);

        }
    }
}
