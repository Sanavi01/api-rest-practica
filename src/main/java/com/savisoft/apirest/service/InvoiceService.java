package com.savisoft.apirest.service;

import com.savisoft.apirest.entity.Invoice;

import java.util.List;

public interface InvoiceService {

    Invoice createInvoice(Invoice invoice);
    void deleteInvoice(Long id);
    List<Invoice> findAllInvoices();
    Invoice updateInvoice(Long id, Invoice invoice);


}
