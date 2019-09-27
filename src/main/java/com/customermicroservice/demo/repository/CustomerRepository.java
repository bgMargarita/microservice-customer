package com.customermicroservice.demo.repository;

import com.customermicroservice.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findById(UUID id);
    void deleteById(UUID id);
}
