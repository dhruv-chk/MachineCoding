package org.example.models;

import java.util.Map;

public class Restaurant {
    String name;
    Integer maxOrders;
    Map<String, Integer> menu;
    Double rating;

    public Restaurant(String name, Integer maxOrders, Map<String, Integer> menu, Double rating) {
        this.name = name;
        this.maxOrders = maxOrders;
        this.menu = menu;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaxOrders() {
        return maxOrders;
    }

    public void setMaxOrders(Integer maxOrders) {
        this.maxOrders = maxOrders;
    }

    public Map<String, Integer> getMenu() {
        return menu;
    }

    public void setMenu(Map<String, Integer> menu) {
        this.menu = menu;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
