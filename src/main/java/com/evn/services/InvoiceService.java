package com.evn.services;

import com.evn.model.Invoice;

import java.util.List;

public interface InvoiceService {
    List<Invoice> getByStatusAndMonthAndYear(String status, int month, int year);
    List<Invoice> getByMonthAndYear(int month, int year);
    List<Invoice> getByStatusAndQuarterAndYear(String status, int quarter, int year);
    List<Invoice> getByQuarterAndYear(int quarter, int year);
    List<Invoice> getByStatus(String status);
}
