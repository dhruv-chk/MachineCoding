package org.example.models;


public class OrderStatus {
    Restaurant restaurant;
    Status status;

    public OrderStatus(Restaurant restaurant, Status status) {
        this.restaurant = restaurant;
        this.status = status;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
