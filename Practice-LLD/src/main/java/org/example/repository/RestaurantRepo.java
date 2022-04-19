package org.example.repository;

import org.example.models.Restaurant;

import java.util.HashMap;
import java.util.Map;

public class RestaurantRepo {
    int id;
    public Map<Integer, Restaurant> restaurantMap;

    public RestaurantRepo() {
        this.id = 0;
        this.restaurantMap = new HashMap<>();
    }

    public void registerRestaurant(Restaurant restaurant){
        restaurant.setId(id);
        restaurantMap.put(id,restaurant);
        id++;
    }
}
