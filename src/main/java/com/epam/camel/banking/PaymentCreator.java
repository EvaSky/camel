package com.epam.camel.banking;

import com.epam.camel.invoices.Invoice;

/**
 * Created by Volha_Shakhrai on 2/14/2017.
 */
public interface PaymentCreator {

    Payment createPayment(Invoice invoice) throws PaymentException;
}
