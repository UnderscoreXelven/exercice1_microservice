package org.example.product.service;

import org.example.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {
    private Map<Integer, Product> products;

    public ProductService() {
        this.products = new HashMap<>();
        this.products.put(1, new Product(1, "Banane", 1.5));
        this.products.put(2, new Product(2, "Tomate", 2.5));
        this.products.put(3, new Product(3, "Lait", 3.5));
    }

    public Product getProductById(int id) {
        return this.products.get(id);
    }
}
