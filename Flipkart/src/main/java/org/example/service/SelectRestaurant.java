package org.example.service;

import org.example.models.Order;
import org.example.models.Restaurant;
import org.example.repositories.OrderRepo;
import org.example.repositories.RestaurantRepo;

public interface SelectRestaurant {
    public Restaurant select(RestaurantRepo restaurantRepo, OrderRepo orderRepo, Order order);
}
