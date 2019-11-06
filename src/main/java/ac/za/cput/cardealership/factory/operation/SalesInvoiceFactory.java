package ac.za.cput.cardealership.factory.operation;

import ac.za.cput.cardealership.domain.finance.SalesInvoice;
import ac.za.cput.cardealership.util.Misc;

public class SalesInvoiceFactory {

    public static SalesInvoice getSalesInvoice(int invoiceNumber, String date){
        return new SalesInvoice.Builder().invoiceID(Misc.generatedId())
                .invoiceNumber(invoiceNumber)
                .date(date)
                .build();
    }
}
