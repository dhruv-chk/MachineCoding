package org.example.repositories;

import org.example.models.Restaurant;

import java.util.HashMap;
import java.util.Map;

public class RestaurantRepo {
    Map<String, Restaurant> restaurantMap;

    public RestaurantRepo() {
        this.restaurantMap = new HashMap<>();
    }

    public void onboardRestaurant(Restaurant restaurant){
        restaurantMap.put(restaurant.getName(), restaurant);
    }

    public Restaurant getRestaurant(String name){
        return restaurantMap.get(name);
    }

    public Restaurant updateRestaurant(Restaurant restaurant){
        restaurantMap.put(restaurant.getName(), restaurant);

        return restaurant;
    }

    public Map<String, Restaurant> getRestaurantMap(){
        return restaurantMap;
    }
}
