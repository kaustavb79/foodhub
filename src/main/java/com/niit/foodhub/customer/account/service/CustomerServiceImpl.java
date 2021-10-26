package com.niit.foodhub.customer.account.service;

import java.util.HashSet;

import com.niit.foodhub.customer.account.model.Customer;
import com.niit.foodhub.customer.account.repository.CustomerRepository;
import com.niit.foodhub.customer.account.repository.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void save(Customer customer) {
       customer.setPassword(passwordEncoder.encode(customer.getPassword())); 
       customer.setRoles(new HashSet<>(roleRepository.findAll()));
       customerRepository.save(customer);
    }

    @Override
    public Customer findByUsername(String username) {
        return customerRepository.findByUsername(username);
    }
    
}
