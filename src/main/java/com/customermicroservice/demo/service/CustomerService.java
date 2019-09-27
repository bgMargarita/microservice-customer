package com.customermicroservice.demo.service;

import com.customermicroservice.demo.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


public interface CustomerService {
    List<Customer> getAll();
    void delete(UUID id);
    Customer getById(UUID id);
}
