package com.niit.foodhub.customer.account.service;

import com.niit.foodhub.customer.account.model.Customer;

public interface CustomerService {
    void save(Customer customer);
    Customer findByUsername(String username);
}
