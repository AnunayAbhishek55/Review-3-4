package com.assignment.maventask.storemgmt.dao;

import com.assignment.maventask.storemgmt.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
