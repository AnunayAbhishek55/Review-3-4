package com.assignment.maventask.storemgmt.service;

import com.assignment.maventask.storemgmt.dao.OrderDAO;
import com.assignment.maventask.storemgmt.model.Order;
import com.assignment.maventask.storemgmt.model.Product;

import java.util.List;

public class OrderService {
    private final OrderDAO orderDAO = new OrderDAO();

    public void placeOrder(int orderId, List<Product> products) {
        Order order = new Order(orderId, products);
        orderDAO.addOrder(order);
    }

    public List<Order> listOrders() {
        return orderDAO.getAllOrders();
    }
}
