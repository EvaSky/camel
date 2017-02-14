package com.epam.camel.invoices;

import com.epam.camel.banking.Payment;
import com.epam.camel.banking.PaymentCreator;
import com.epam.camel.banking.PaymentException;
import org.springframework.stereotype.Component;

/**
 * Created by Volha_Shakhrai on 2/14/2017.
 */
@Component
public class LocalPaymentCreator implements PaymentCreator {

    // hard coded account value for demo purposes
    private static final String CURRENT_LOCAL_ACC = "current-local-acc";

    @Override
    public Payment createPayment(Invoice invoice) throws PaymentException {
        if (null == invoice.getAccount()) {
            throw new PaymentException("Account can not be empty when creating local payment!");
        }

        return new Payment(CURRENT_LOCAL_ACC, invoice.getAccount(), invoice.getDollars());
    }
}
