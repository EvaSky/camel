package com.epam.camel.invoices;

import com.epam.camel.banking.Payment;
import com.epam.camel.banking.PaymentCreator;
import com.epam.camel.banking.PaymentException;
import org.springframework.stereotype.Component;

/**
 * Created by Volha_Shakhrai on 2/14/2017.
 */
@Component
public class ForeignPaymentCreator implements PaymentCreator {

    // hard coded account value for demo purposes
    private static final String CURRENT_IBAN_ACC = "current-iban-acc";

    @Override
    public Payment createPayment(Invoice invoice) throws PaymentException {
        if (null == invoice.getIban()) {
            throw new PaymentException("IBAN mustn't be null when creating foreign payment!");
        }

        return new Payment(CURRENT_IBAN_ACC, invoice.getIban(), invoice.getDollars());
    }
}
