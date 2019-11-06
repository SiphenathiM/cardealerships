package ac.za.cput.cardealership.domain.finance;

public class SalesInvoice {

    private String invoiceID;
    private int invoiceNumber;
    private String date;

    public String getInvoiceID() {
        return invoiceID;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getDate() {
        return date;
    }

    public SalesInvoice(Builder builder) {
        this.invoiceID= builder.invoiceID;
        this.invoiceNumber  = builder.invoiceNumber ;
        this.date  = builder.date ;

    }
    public static class Builder {

        private String invoiceID;
        private int invoiceNumber;
        private String date;


        public Builder invoiceID(String invoiceID) {
            this.invoiceID = invoiceID;
            return this;
        }

        public Builder invoiceNumber(int invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
            return this;
        }

        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public SalesInvoice build() {
            return new SalesInvoice(this);

        }
    }
}
