package com.gescom.web;

import com.gescom.entities.Order;
import com.gescom.models.OrderModel;
import com.gescom.services.OrderService;
import com.gescom.services.PersonService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderRestController {
    private OrderService orderService;
    private PersonService personService;

    @PostMapping("/orders")
    void saveOrder(@RequestBody OrderModel orderModel){
        Order order = new Order();
        order.setClient(personService.findOneClientById(orderModel.getClientId()));
        order.setDate(new Date());
        order.setPayment(null);
        order.setMountTotal(0);

        this.orderService.createOrder(order);
    }

    @GetMapping("/orders")
    List<Order> findAll(){
        return this.orderService.findAllOrder();
    }


}
