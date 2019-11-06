package ac.za.cput.cardealership.domain.finance;

public class FinancingSale extends Sale {

    private  String totalPeriod;
    private double paymentAmount;

    public FinancingSale(Builder builder) {
        super(builder);
        this.totalPeriod = totalPeriod;
        this.paymentAmount = paymentAmount;
    }



    public String getTotalPeriod() {
        return totalPeriod;
    }
    public Double getPaymentAmout() {
        return paymentAmount;
    }

    public static class Builder extends Sale.Builder {

        private  String totalPeriod;
        private double paymentAmount;


        public Builder totalPeriod(String totalPeriod) {
            this.totalPeriod = totalPeriod;
            return this;
        }

        public Builder paymentAmount(double paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }

        public FinancingSale build() {
            return new FinancingSale(this);
        }
    }

}
