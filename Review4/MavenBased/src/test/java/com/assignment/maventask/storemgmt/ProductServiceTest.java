package com.assignment.maventask.storemgmt;

import com.assignment.maventask.storemgmt.service.ProductService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductServiceTest {

    @Test
    public void testAddProduct() {
        ProductService productService = new ProductService();
        productService.addProduct(1, "Laptop", 1200.0);
        assertEquals(1, productService.listProducts().size());
    }
}
