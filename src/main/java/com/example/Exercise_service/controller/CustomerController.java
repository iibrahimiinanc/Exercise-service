package com.example.Exercise_service.controller;

import com.example.Exercise_service.entity.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
      return new Customer(id , " ibrahim", "inanç");
    }
   @GetMapping()
    public List<Customer> getAllCustomer(){
        return List.of(
                new Customer(1L,"ibrahim","inanç"),
                new Customer(2L, "ahmet", "inanç"),
                new Customer(3L,"mehmet ", "inanç")
        );

   }
}
