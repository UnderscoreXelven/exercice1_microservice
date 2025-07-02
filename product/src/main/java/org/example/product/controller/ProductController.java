package org.example.product.controller;

import org.example.product.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {
    private Map<Integer, Product> products;

    public ProductController() {
        this.products = new HashMap<>();
        this.products.put(1, new Product(1, "Banane", 1.5));
        this.products.put(2, new Product(2, "Tomate", 2.5));
        this.products.put(3, new Product(3, "Lait", 3.5));
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return this.products.get(id);
    }
}
