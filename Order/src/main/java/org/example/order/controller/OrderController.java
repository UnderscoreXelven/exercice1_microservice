package org.example.order.controller;

import org.example.order.model.Customer;
import org.example.order.model.Order;
import org.example.order.model.Product;
import org.example.order.util.RestClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable int id){
        Order order = new Order();
        order.setId(id);
        order.setDescription("Order du 02/07/2025 du client " + id);
        RestClient<Customer> customerRestClient = new RestClient<>("http://localhost:8081/customer/" + id);
        order.setCustomer(customerRestClient.get(Customer.class));
        RestClient<Product> productRestClient = new RestClient<>("http://localhost:8082/product/" + id);
        order.setProduct(productRestClient.get(Product.class));
        return order;
    }
}
