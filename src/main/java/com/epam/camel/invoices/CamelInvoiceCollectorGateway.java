package com.epam.camel.invoices;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by Volha_Shakhrai on 2/14/2017.
 */
@Component
public class CamelInvoiceCollectorGateway implements InvoiceCollectorGateway {

    @Produce(uri = "seda:newInvoicesChannel")
    ProducerTemplate producerTemplate;

    @Override
    public void collectInvoices(Collection<Invoice> invoices) {
        producerTemplate.sendBody(invoices);
    }
}
