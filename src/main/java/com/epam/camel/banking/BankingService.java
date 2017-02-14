package com.epam.camel.banking;

/**
 * Created by Volha_Shakhrai on 2/14/2017.
 */
public interface BankingService {

    void pay(Payment payment) throws PaymentException;
}
