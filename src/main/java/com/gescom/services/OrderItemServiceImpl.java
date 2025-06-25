package com.gescom.services;

import com.gescom.entities.OrderItem;
import com.gescom.repositories.OrderItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    private final OrderItemRepository repository;

    OrderItemServiceImpl(final OrderItemRepository repository){
        this.repository = repository;
    }

    @Override
    public void createOrderItem(OrderItem orderItem) {
        this.repository.save(orderItem);
    }

    @Override
    public List<OrderItem> findAll() {
        return this.repository.findAll();
    }

    @Override
    public void editOrderItem(OrderItem orderItem, long id) {
      OrderItem item = this.repository.getReferenceById(id);
      item.setProduct(orderItem.getProduct());
      item.setOrder(orderItem.getOrder());
      item.setQuantity(orderItem.getQuantity());
      item.setPrice(orderItem.getPrice());

      this.repository.save(item);
    }

    @Override
    public void deleletOrderItem(long id) {
        this.repository.deleteById(id);
    }
}
