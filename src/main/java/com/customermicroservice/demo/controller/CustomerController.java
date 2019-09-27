package com.customermicroservice.demo.controller;

import com.customermicroservice.demo.entity.Customer;
import com.customermicroservice.demo.service.CustomerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("customers")
public class CustomerController {
    private final CustomerServiceImpl customerService;

    public CustomerController(CustomerServiceImpl customerService) {

        this.customerService = customerService;
    }

    @GetMapping("{id}/info")
    public Customer getCustomer(@PathVariable("id") UUID id) {
        return customerService.getById(id);
    }

    @GetMapping("all/info")
    public List<Customer> getAll() {
        return customerService.getAll();
    }

    @PostMapping("create")
    public void create(@RequestBody Customer customerInfo) {
        customerService.create(customerInfo);
    }
}
