package com.example.Exercise_service.controller;

import com.example.Exercise_service.entity.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
      return new Customer(id , " ibrahim", "inanç");
    }

}
