package com.assignment.maventask.storemgmt;

import com.assignment.maventask.storemgmt.model.Product;
import com.assignment.maventask.storemgmt.service.OrderService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    @Test
    public void testPlaceOrder() {
        OrderService orderService = new OrderService();
        Product product = new Product(1, "Laptop", 1200.0);
        orderService.placeOrder(1, List.of(product));
        assertEquals(1, orderService.listOrders().size());
    }
}
