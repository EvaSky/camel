package com.epam.camel.invoices;

import com.epam.camel.banking.BankingService;
import com.epam.camel.banking.Payment;
import com.epam.camel.banking.PaymentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Volha_Shakhrai on 2/14/2017.
 */
@Component
public class PaymentProcessor {
    @Autowired
    BankingService bankingService;

    public void processPayment(Payment payment) throws PaymentException {
        bankingService.pay(payment);
    }
}
