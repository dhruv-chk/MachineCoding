package org.example.models;

public class Order {
    Restaurant restaurant;
    User user;
    Integer quantity;

    public Order(Restaurant restaurant, User user, Integer quantity) {
        this.restaurant = restaurant;
        this.user = user;
        this.quantity = quantity;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
