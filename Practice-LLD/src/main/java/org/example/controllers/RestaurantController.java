package org.example.controllers;

import org.example.models.Restaurant;
import org.example.repository.RestaurantRepo;

import java.util.List;

public class RestaurantController {

    RestaurantRepo restaurantRepo;

    public RestaurantController() {
        this.restaurantRepo = new RestaurantRepo();
    }

    public Restaurant registerRestaurant(String restaurant_name, List<String> service_pincode, String item, Double price, Integer quantity, Double rate){
        Restaurant restaurant = new Restaurant(restaurant_name, service_pincode, item, price,  quantity, rate);
        restaurantRepo.registerRestaurant(restaurant);

        return restaurant;
    }
}
