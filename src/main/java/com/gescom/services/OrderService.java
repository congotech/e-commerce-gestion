package com.gescom.services;

import com.gescom.entities.Order;

import java.util.List;

public interface OrderService {
    void createOrder(Order order);
    void delete(long id);
    Order editOrder(Order order, long id);
    List<Order> findAllOrder();
}
