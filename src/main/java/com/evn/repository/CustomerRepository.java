package com.evn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evn.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
