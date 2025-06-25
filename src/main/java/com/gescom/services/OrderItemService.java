package com.gescom.services;

import com.gescom.entities.OrderItem;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderItemService {
    void createOrderItem(OrderItem orderItem);
    List<OrderItem> findAll();
    void editOrderItem(OrderItem orderItem, long id);
    void deleletOrderItem(long id);
}
