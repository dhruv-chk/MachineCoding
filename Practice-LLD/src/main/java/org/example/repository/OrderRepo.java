package org.example.repository;

import org.example.models.Order;
import org.example.models.Restaurant;
import org.example.models.User;

import java.util.HashMap;
import java.util.Map;

public class OrderRepo {
    int id;
    public Map<Integer, Order> orderMap;

    public OrderRepo() {
        this.id = 0;
        this.orderMap = new HashMap<>();
    }

    public Integer placeOrder(User user, Restaurant restaurant, int quantity){
        Order order = new Order(restaurant, user, quantity);
        orderMap.put(id, order);
        id ++;

        return id-1;
    }
}
