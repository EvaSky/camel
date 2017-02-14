package com.epam.camel.invoices;


import org.apache.camel.Exchange;
import org.apache.camel.Predicate;

/**
 * Created by Volha_Shakhrai on 2/14/2017.
 */
public class LowEnoughAmountPredicate implements Predicate {

    public static final int LOW_ENOUGH_THRESHOLD = 10_000;

    @Override
    public boolean matches(Exchange exchange) {
        Invoice invoice = exchange.getIn().getBody(Invoice.class);
        boolean lowEnough = invoice.getDollars().intValue() < LOW_ENOUGH_THRESHOLD;
        System.out.println("Amount of $" + invoice.getDollars()
                + (lowEnough ? " can" : " can not") + " be automatically processed by system");

        return lowEnough;
    }
}
