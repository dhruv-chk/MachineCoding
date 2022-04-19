package org.example.models;

import java.util.List;

public class Restaurant {
    Integer id;
    String restaurant_name;
    List<String> service_pincode;
    String item;
    Double price;
    Integer quantity;
    Double rate;

    public Restaurant(String restaurant_name, List<String> service_pincode, String item, Double price, Integer quantity, Double rate) {
        this.restaurant_name = restaurant_name;
        this.service_pincode = service_pincode;
        this.item = item;
        this.price = price;
        this.quantity = quantity;
        this.rate = rate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRestaurant_name() {
        return restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }

    public List<String> getService_pincode() {
        return service_pincode;
    }

    public void setService_pincode(List<String> service_pincode) {
        this.service_pincode = service_pincode;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
