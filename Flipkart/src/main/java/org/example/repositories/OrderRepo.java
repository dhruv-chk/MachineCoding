package org.example.repositories;

import org.example.models.Order;
import org.example.models.OrderStatus;
import org.example.models.Status;

import java.util.HashMap;
import java.util.Map;

public class OrderRepo {
    Integer id;
    Map<Integer, Order> orderMap;

    public OrderRepo() {
        this.id = 0;
        this.orderMap = new HashMap<>();
    }

    public Order placeOrder(Order order){
        order.setId(id);
        orderMap.put(id, order);
        id ++;
        return order;
    }

    public Order getOrder(Integer id){
        return orderMap.get(id);
    }

    public void updateOrder(Order order, Status status){
        OrderStatus orderStatus = order.getOrderStatus();
        orderStatus.setStatus(status);
        order.setOrderStatus(orderStatus);
        orderMap.put(order.getId(), order);
    }
}
