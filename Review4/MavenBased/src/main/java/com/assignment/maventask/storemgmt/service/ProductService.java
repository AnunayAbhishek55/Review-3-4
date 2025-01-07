package com.assignment.maventask.storemgmt.service;

import com.assignment.maventask.storemgmt.dao.ProductDAO;
import com.assignment.maventask.storemgmt.model.Product;

import java.util.List;

public class ProductService {
    private final ProductDAO productDAO = new ProductDAO();

    public void addProduct(int id, String name, double price) {
        Product product = new Product(id, name, price);
        productDAO.addProduct(product);
    }

    public List<Product> listProducts() {
        return productDAO.getAllProducts();
    }
}
