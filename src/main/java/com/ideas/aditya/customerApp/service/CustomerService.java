package com.ideas.aditya.customerApp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ideas.aditya.customerApp.entity.Customer;
import com.ideas.aditya.customerApp.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public List<Customer> findByName(String name) {

        return customerRepository.findByName(name);
    }
    
    public List<Customer> findAll() {

        return customerRepository.findAll();
        
    }
    
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    
    public long deleteCustomerByName(String name) {
        return customerRepository.deleteByName(name);
    }
    
   
}
