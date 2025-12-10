package com.example.Exercise_service.service;

import com.example.Exercise_service.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    // Veritabanı yerine bellekte liste tutma
private List<Customer> customerList = new ArrayList<>();
// Otomatik ID üretmek için sayaç
private Long counter = 1L;

public Customer createCustomer(Customer customer){
    customer.setCustomerNo(counter++);
    customerList.add(customer);
    return customer;
}


public Customer getCustomerById(Long id){
    return customerList.stream()
            .filter(c -> c.getCustomerNo().equals(id))
            .findFirst()
            .orElse(null);
}
public List<Customer>getAllCustomers(){
    return customerList;
}
}

