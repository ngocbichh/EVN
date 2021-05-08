package com.evn.services;

import com.evn.model.Invoice;
import com.evn.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public InvoiceServiceImpl(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public List<Invoice> getByStatusAndMonthAndYear(String status, int month, int year) {
        List<Invoice> result = invoiceRepository.findByStatusAndMonthAndYear(status, month, year);
        return result;
    }

    @Override
    public List<Invoice> getByMonthAndYear(int month, int year) {
        List<Invoice> result = invoiceRepository.findByMonthAndYear(month, year);
        return result;
    }

    @Override
    public List<Invoice> getByStatusAndQuarterAndYear(String status, int quarter, int year) {
        List<Invoice> result = invoiceRepository.findByStatusAndQuarterAndYear(status, quarter, year);
        return result;
    }

    @Override
    public List<Invoice> getByQuarterAndYear(int quarter, int year) {
        List<Invoice> result = invoiceRepository.findByQuarterAndYear(quarter, year);
        return result;
    }

    @Override
    public List<Invoice> getByStatus(String status) {
        List<Invoice> result = invoiceRepository.findByStatus(status);
        return result;
    }
}
