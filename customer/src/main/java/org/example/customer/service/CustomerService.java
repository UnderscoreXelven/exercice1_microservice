package org.example.customer.service;

import org.example.customer.model.Customer;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerService {
    Map<Integer, Customer> customers;

    public CustomerService() {
        this.customers = new HashMap<>();
        customers.put(1, new Customer(1, "Customer 1"));
        customers.put(2, new Customer(2, "Customer 2"));
        customers.put(3, new Customer(3, "Customer 3"));
    }

    public Customer getCustomerById(int id) {
        return customers.get(id);
    }
}
