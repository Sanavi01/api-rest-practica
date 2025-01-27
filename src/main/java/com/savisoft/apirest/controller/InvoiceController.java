package com.savisoft.apirest.controller;

import com.savisoft.apirest.entity.Invoice;
import com.savisoft.apirest.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvoiceController {

    @Autowired
    InvoiceService invoiceService;

    @PostMapping("/createInvoice")
    public Invoice createInvoice(@RequestBody Invoice invoice){
        return invoiceService.createInvoice(invoice);
    }

    @DeleteMapping("/deleteInvoice/{id}")
    public void deleteInvoice(@PathVariable Long id){
        invoiceService.deleteInvoice(id);
    }

    @GetMapping("/findAllInvoices")
    public List<Invoice> findAllInvoices(){
        return invoiceService.findAllInvoices();
    }

    @PutMapping("/updateInvoice/{id}")
    public Invoice updateInvoice(@PathVariable Long id, @RequestBody Invoice invoice){
        return invoiceService.updateInvoice(id, invoice);
    }







}
