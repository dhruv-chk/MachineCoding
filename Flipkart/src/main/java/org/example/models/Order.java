package org.example.models;

import java.util.List;
import java.util.Map;

public class Order {

    Integer id;
    String username;
    Map<String, Integer> items;
    Strategy strategy;
    OrderStatus orderStatus;

    public Order(String username, Map<String, Integer> items, Strategy strategy) {
        this.username = username;
        this.items = items;
        this.strategy = strategy;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<String, Integer> getItems() {
        return items;
    }

    public void setItems(Map<String, Integer> items) {
        this.items = items;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
