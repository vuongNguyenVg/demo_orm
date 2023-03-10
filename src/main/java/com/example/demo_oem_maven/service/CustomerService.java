package com.example.demo_oem_maven.service;
import com.example.demo_oem_maven.model.Customer;

import java.util.List;

public interface CustomerService{
   List<Customer> findAll();

   Customer findById(Long id);

   void save(Customer customer);

   void remove(Long id);
}