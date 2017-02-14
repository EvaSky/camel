package com.epam.camel.invoices;

import java.util.Collection;

/**
 * Created by Volha_Shakhrai on 2/14/2017.
 */
public interface InvoiceCollectorGateway {

    void collectInvoices(Collection<Invoice> invoices);
}
