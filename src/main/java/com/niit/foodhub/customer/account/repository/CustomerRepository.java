package com.niit.foodhub.customer.account.repository;

import com.niit.foodhub.customer.account.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long>{
    Customer findByUsername(String username);
}
