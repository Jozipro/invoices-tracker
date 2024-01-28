package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepository;

public class InvoiceService {

    private static long lastNumber=0L;

    //Avoiding repetition
    private InvoiceRepository invoiceRepository=new InvoiceRepository();

    //Mark invoices one by one
    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
