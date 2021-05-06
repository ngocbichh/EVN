package com.evn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evn.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, String>{
	public List<Invoice> findByStatusAndMonthAndYear(String status, int month, int year); 
	public List<Invoice> findByMonthAndYear(int month, int year);
	public List<Invoice> findByStatusAndQuarterAndYear(String status, int quarter, int year); 
	public List<Invoice> findByQuarterAndYear(int quarter, int year);
	public List<Invoice> findByStatus(String status);
}
