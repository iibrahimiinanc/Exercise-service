package com.example.Exercise_service.controller;

import com.example.Exercise_service.entity.Customer;
import com.example.Exercise_service.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return new Customer(id, " ibrahim", "inanç");
    }

    @GetMapping()
    public List<Customer> getAllCustomer() {
        return List.of(
                new Customer(1L, "ibrahim", "inanç"),
                new Customer(2L, "ahmet", "inanç"),
                new Customer(3L, "mehmet ", "inanç")
        );

    }

    // POST - Yeni müşteri ekleme
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        customer.setCustomerNo(112L);
        return customer;
    }
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
