package com.example.demo_oem_maven.service.impl;
import com.example.demo_oem_maven.model.Customer;
import com.example.demo_oem_maven.repository.CustomerRepository;
import com.example.demo_oem_maven.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

   @Autowired
   private CustomerRepository customerRepository;

   @Override
   public List<Customer> findAll() {
      return customerRepository.findAll();
   }

   @Override
   public Customer findById(Long id) {
      return customerRepository.findById(id);
   }

   @Override
   public void save(Customer customer) {
      customerRepository.save(customer);
   }

   @Override
   public void remove(Long id) {
      customerRepository.remove(id);
   }
}