package org.example.customer.controller;

import org.example.customer.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    Map<Integer, Customer> customers;

    public CustomerController() {
        this.customers = new HashMap<>();
        customers.put(1, new Customer(1, "Customer 1"));
        customers.put(2, new Customer(2, "Customer 2"));
        customers.put(3, new Customer(3, "Customer 3"));
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customers.get(id);
    }
}
