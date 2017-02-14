package com.epam.camel.banking;

import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by Volha_Shakhrai on 2/14/2017.
 */
@Service
public class MockBankingService implements BankingService {

    private final Random rand = new Random();

    @Override
    public void pay(Payment payment) throws PaymentException {
        if (rand.nextDouble() > 0.9) {
            throw new PaymentException("Banking services are offline, try again later!");
        }

        System.out.println("Processing payment " + payment);
    }
}
