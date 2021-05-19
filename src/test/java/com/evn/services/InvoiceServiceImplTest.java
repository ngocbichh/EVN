package com.evn.services;

import com.evn.model.Invoice;
import com.evn.repository.InvoiceRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class InvoiceServiceImplTest {

    @Mock
    private InvoiceRepository mockInvoiceRepository;

    private InvoiceServiceImpl invoiceServiceImplUnderTest;

    @BeforeEach
    void setUp() {
        invoiceServiceImplUnderTest = new InvoiceServiceImpl(mockInvoiceRepository);
    }

    @Test
    void testGetByStatusAndMonthAndYear() {
        // Setup
        final Invoice invoice = new Invoice();
        invoice.setIdInvice("idInvice");
        invoice.setOldIndex(0);
        invoice.setNewIndex(0);
        invoice.setMoney(0.0f);
        invoice.setVAT(0.0f);
        invoice.setTotal(0.0f);
        invoice.setMonth(1);
        invoice.setYear(2020);
        invoice.setQuarter(0);
        invoice.setStatus("status");
        final List<Invoice> expectedResult = List.of(invoice);

        // Configure InvoiceRepository.findByStatusAndMonthAndYear(...).
        final Invoice invoice1 = new Invoice();
        invoice1.setIdInvice("idInvice");
        invoice1.setOldIndex(0);
        invoice1.setNewIndex(0);
        invoice1.setMoney(0.0f);
        invoice1.setVAT(0.0f);
        invoice1.setTotal(0.0f);
        invoice1.setMonth(1);
        invoice1.setYear(2020);
        invoice1.setQuarter(0);
        invoice1.setStatus("status");
        final List<Invoice> invoices = List.of(invoice1);
        when(mockInvoiceRepository.findByStatusAndMonthAndYear("status", 1, 2020)).thenReturn(invoices);

        // Run the test
        final List<Invoice> result = invoiceServiceImplUnderTest.getByStatusAndMonthAndYear("status", 1, 2020);

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetByStatusAndMonthAndYear_InvoiceRepositoryReturnsNoItems() {
        // Setup
        final Invoice invoice = new Invoice();
        invoice.setIdInvice("idInvice");
        invoice.setOldIndex(0);
        invoice.setNewIndex(0);
        invoice.setMoney(0.0f);
        invoice.setVAT(0.0f);
        invoice.setTotal(0.0f);
        invoice.setMonth(1);
        invoice.setYear(2020);
        invoice.setQuarter(0);
        invoice.setStatus("status");
        final List<Invoice> expectedResult = List.of(invoice);
        when(mockInvoiceRepository.findByStatusAndMonthAndYear("status", 1, 2020)).thenReturn(Collections.emptyList());

        // Run the test
        final List<Invoice> result = invoiceServiceImplUnderTest.getByStatusAndMonthAndYear("status", 1, 2020);

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetByMonthAndYear() {
        // Setup
        final Invoice invoice = new Invoice();
        invoice.setIdInvice("idInvice");
        invoice.setOldIndex(0);
        invoice.setNewIndex(0);
        invoice.setMoney(0.0f);
        invoice.setVAT(0.0f);
        invoice.setTotal(0.0f);
        invoice.setMonth(1);
        invoice.setYear(2020);
        invoice.setQuarter(0);
        invoice.setStatus("status");
        final List<Invoice> expectedResult = List.of(invoice);

        // Configure InvoiceRepository.findByMonthAndYear(...).
        final Invoice invoice1 = new Invoice();
        invoice1.setIdInvice("idInvice");
        invoice1.setOldIndex(0);
        invoice1.setNewIndex(0);
        invoice1.setMoney(0.0f);
        invoice1.setVAT(0.0f);
        invoice1.setTotal(0.0f);
        invoice1.setMonth(1);
        invoice1.setYear(2020);
        invoice1.setQuarter(0);
        invoice1.setStatus("status");
        final List<Invoice> invoices = List.of(invoice1);
        when(mockInvoiceRepository.findByMonthAndYear(1, 2020)).thenReturn(invoices);

        // Run the test
        final List<Invoice> result = invoiceServiceImplUnderTest.getByMonthAndYear(1, 2020);

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetByMonthAndYear_InvoiceRepositoryReturnsNoItems() {
        // Setup
        final Invoice invoice = new Invoice();
        invoice.setIdInvice("idInvice");
        invoice.setOldIndex(0);
        invoice.setNewIndex(0);
        invoice.setMoney(0.0f);
        invoice.setVAT(0.0f);
        invoice.setTotal(0.0f);
        invoice.setMonth(1);
        invoice.setYear(2020);
        invoice.setQuarter(0);
        invoice.setStatus("status");
        final List<Invoice> expectedResult = List.of(invoice);
        when(mockInvoiceRepository.findByMonthAndYear(1, 2020)).thenReturn(Collections.emptyList());

        // Run the test
        final List<Invoice> result = invoiceServiceImplUnderTest.getByMonthAndYear(1, 2020);

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetByStatusAndQuarterAndYear() {
        // Setup
        final Invoice invoice = new Invoice();
        invoice.setIdInvice("idInvice");
        invoice.setOldIndex(0);
        invoice.setNewIndex(0);
        invoice.setMoney(0.0f);
        invoice.setVAT(0.0f);
        invoice.setTotal(0.0f);
        invoice.setMonth(1);
        invoice.setYear(2020);
        invoice.setQuarter(0);
        invoice.setStatus("status");
        final List<Invoice> expectedResult = List.of(invoice);

        // Configure InvoiceRepository.findByStatusAndQuarterAndYear(...).
        final Invoice invoice1 = new Invoice();
        invoice1.setIdInvice("idInvice");
        invoice1.setOldIndex(0);
        invoice1.setNewIndex(0);
        invoice1.setMoney(0.0f);
        invoice1.setVAT(0.0f);
        invoice1.setTotal(0.0f);
        invoice1.setMonth(1);
        invoice1.setYear(2020);
        invoice1.setQuarter(0);
        invoice1.setStatus("status");
        final List<Invoice> invoices = List.of(invoice1);
        when(mockInvoiceRepository.findByStatusAndQuarterAndYear("status", 0, 2020)).thenReturn(invoices);

        // Run the test
        final List<Invoice> result = invoiceServiceImplUnderTest.getByStatusAndQuarterAndYear("status", 0, 2020);

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetByStatusAndQuarterAndYear_InvoiceRepositoryReturnsNoItems() {
        // Setup
        final Invoice invoice = new Invoice();
        invoice.setIdInvice("idInvice");
        invoice.setOldIndex(0);
        invoice.setNewIndex(0);
        invoice.setMoney(0.0f);
        invoice.setVAT(0.0f);
        invoice.setTotal(0.0f);
        invoice.setMonth(1);
        invoice.setYear(2020);
        invoice.setQuarter(0);
        invoice.setStatus("status");
        final List<Invoice> expectedResult = List.of(invoice);
        when(mockInvoiceRepository.findByStatusAndQuarterAndYear("status", 0, 2020)).thenReturn(Collections.emptyList());

        // Run the test
        final List<Invoice> result = invoiceServiceImplUnderTest.getByStatusAndQuarterAndYear("status", 0, 2020);

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetByQuarterAndYear() {
        // Setup
        final Invoice invoice = new Invoice();
        invoice.setIdInvice("idInvice");
        invoice.setOldIndex(0);
        invoice.setNewIndex(0);
        invoice.setMoney(0.0f);
        invoice.setVAT(0.0f);
        invoice.setTotal(0.0f);
        invoice.setMonth(1);
        invoice.setYear(2020);
        invoice.setQuarter(0);
        invoice.setStatus("status");
        final List<Invoice> expectedResult = List.of(invoice);

        // Configure InvoiceRepository.findByQuarterAndYear(...).
        final Invoice invoice1 = new Invoice();
        invoice1.setIdInvice("idInvice");
        invoice1.setOldIndex(0);
        invoice1.setNewIndex(0);
        invoice1.setMoney(0.0f);
        invoice1.setVAT(0.0f);
        invoice1.setTotal(0.0f);
        invoice1.setMonth(1);
        invoice1.setYear(2020);
        invoice1.setQuarter(0);
        invoice1.setStatus("status");
        final List<Invoice> invoices = List.of(invoice1);
        when(mockInvoiceRepository.findByQuarterAndYear(0, 2020)).thenReturn(invoices);

        // Run the test
        final List<Invoice> result = invoiceServiceImplUnderTest.getByQuarterAndYear(0, 2020);

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetByQuarterAndYear_InvoiceRepositoryReturnsNoItems() {
        // Setup
        final Invoice invoice = new Invoice();
        invoice.setIdInvice("idInvice");
        invoice.setOldIndex(0);
        invoice.setNewIndex(0);
        invoice.setMoney(0.0f);
        invoice.setVAT(0.0f);
        invoice.setTotal(0.0f);
        invoice.setMonth(1);
        invoice.setYear(2020);
        invoice.setQuarter(0);
        invoice.setStatus("status");
        final List<Invoice> expectedResult = List.of(invoice);
        when(mockInvoiceRepository.findByQuarterAndYear(0, 2020)).thenReturn(Collections.emptyList());

        // Run the test
        final List<Invoice> result = invoiceServiceImplUnderTest.getByQuarterAndYear(0, 2020);

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetByStatus() {
        // Setup
        final Invoice invoice = new Invoice();
        invoice.setIdInvice("idInvice");
        invoice.setOldIndex(0);
        invoice.setNewIndex(0);
        invoice.setMoney(0.0f);
        invoice.setVAT(0.0f);
        invoice.setTotal(0.0f);
        invoice.setMonth(1);
        invoice.setYear(2020);
        invoice.setQuarter(0);
        invoice.setStatus("status");
        final List<Invoice> expectedResult = List.of(invoice);

        // Configure InvoiceRepository.findByStatus(...).
        final Invoice invoice1 = new Invoice();
        invoice1.setIdInvice("idInvice");
        invoice1.setOldIndex(0);
        invoice1.setNewIndex(0);
        invoice1.setMoney(0.0f);
        invoice1.setVAT(0.0f);
        invoice1.setTotal(0.0f);
        invoice1.setMonth(1);
        invoice1.setYear(2020);
        invoice1.setQuarter(0);
        invoice1.setStatus("status");
        final List<Invoice> invoices = List.of(invoice1);
        when(mockInvoiceRepository.findByStatus("status")).thenReturn(invoices);

        // Run the test
        final List<Invoice> result = invoiceServiceImplUnderTest.getByStatus("status");

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetByStatus_InvoiceRepositoryReturnsNoItems() {
        // Setup
        final Invoice invoice = new Invoice();
        invoice.setIdInvice("idInvice");
        invoice.setOldIndex(0);
        invoice.setNewIndex(0);
        invoice.setMoney(0.0f);
        invoice.setVAT(0.0f);
        invoice.setTotal(0.0f);
        invoice.setMonth(1);
        invoice.setYear(2020);
        invoice.setQuarter(0);
        invoice.setStatus("status");
        final List<Invoice> expectedResult = List.of(invoice);
        when(mockInvoiceRepository.findByStatus("status")).thenReturn(Collections.emptyList());

        // Run the test
        final List<Invoice> result = invoiceServiceImplUnderTest.getByStatus("status");

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }
}
