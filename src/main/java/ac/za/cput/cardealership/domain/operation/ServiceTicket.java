package ac.za.cput.cardealership.domain.operation;

public class ServiceTicket {

    private String serviceTicketID;
    private  int number;
    private  String dateRecieved;

    public String getServiceTicketID() {
        return serviceTicketID;
    }

    public int getNumber() {
        return number;
    }

    public String getDateRecieved() {
        return dateRecieved;
    }

    public ServiceTicket(Builder builder) {

        this.serviceTicketID = builder.serviceTicketID;
        this.number = builder.number;
        this.dateRecieved = builder.dateRecieved;
    }
    public static class Builder {

        private String serviceTicketID;
        private  int number;
        private  String dateRecieved;


        public Builder serviceTicketID (String serviceTicketID) {
            this.serviceTicketID = serviceTicketID;
            return this;
        }

        public Builder number (int number) {
            this.number = number;
            return this;
        }

        public Builder dateRecieved(String dateRecieved) {
            this.dateRecieved = dateRecieved;
            return this;
        }

        public ServiceTicket build() {
            return new ServiceTicket(this);

        }
    }
}
