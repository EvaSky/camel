package com.epam.camel.banking;

import java.math.BigDecimal;

/**
 * Created by Volha_Shakhrai on 2/14/2017.
 */
public class Payment {

    private final String senderAccount;
    private final String receiverAccount;
    private final BigDecimal dollars;

    public Payment(String senderAccount, String receiverAccount, BigDecimal dollars) {
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.dollars = dollars;
    }

    public String getSenderAccount() {
        return senderAccount;
    }

    public String getReceiverAccount() {
        return receiverAccount;
    }

    public BigDecimal getDollars() {
        return dollars;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "senderAccount='" + senderAccount + '\'' +
                ", receiverAccount='" + receiverAccount + '\'' +
                ", dollars=" + dollars +
                '}';
    }
}
