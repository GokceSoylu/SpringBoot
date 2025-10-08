package com.gokcesoylu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gokcesoylu.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
