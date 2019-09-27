package com.customermicroservice.demo.service;

import com.customermicroservice.demo.entity.Customer;
import com.customermicroservice.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public void delete(UUID id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer getById(UUID id) {
        return customerRepository.findById(id);
    }

    public void create(Customer customer) {
        customerRepository.save(customer);
    }
}
