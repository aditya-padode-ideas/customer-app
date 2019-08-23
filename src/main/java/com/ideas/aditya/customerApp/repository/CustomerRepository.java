package com.ideas.aditya.customerApp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import com.ideas.aditya.customerApp.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
    List<Customer> findByName(String name);
    
    @Transactional
    long deleteByName(String name);
}
