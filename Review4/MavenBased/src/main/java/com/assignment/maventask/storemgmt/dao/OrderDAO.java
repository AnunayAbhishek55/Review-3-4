package com.assignment.maventask.storemgmt.dao;

import com.assignment.maventask.storemgmt.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderDAO {
    private final List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getAllOrders() {
        return orders;
    }
}
