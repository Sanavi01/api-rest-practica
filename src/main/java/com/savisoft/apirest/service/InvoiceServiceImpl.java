package com.savisoft.apirest.service;

import com.savisoft.apirest.entity.Invoice;
import com.savisoft.apirest.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService{

    @Autowired
    InvoiceRepository invoiceRepository;

    @Override
    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public void deleteInvoice(Long id) {
        invoiceRepository.deleteById(id);
    }

    @Override
    public List<Invoice> findAllInvoices() {
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice updateInvoice(Long id, Invoice invoice) {
        Invoice invoiceDb = invoiceRepository.findById(id).get();
        invoiceDb.setPrice(invoice.getPrice());
        invoiceDb.setQuantity(invoice.getQuantity());

        return invoiceRepository.save(invoiceDb);
    }
}
