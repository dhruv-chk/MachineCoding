package org.example.service;

import org.example.models.Order;
import org.example.models.Restaurant;
import org.example.repositories.OrderRepo;
import org.example.repositories.RestaurantRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SelectLowestCostRestaurant implements SelectRestaurant{
    @Override
    public Restaurant select(RestaurantRepo restaurantRepo, OrderRepo orderRepo, Order order) {
        Map<String, Restaurant> restaurantMap = restaurantRepo.getRestaurantMap();
        Map<String, Integer> items = order.getItems();

        List<Restaurant> restaurantList = new ArrayList<>();

        boolean hasItems = false;
        for(Map.Entry<String, Restaurant> rst : restaurantMap.entrySet()){
            Restaurant rest = null;
            for(Map.Entry<String, Integer> item : items.entrySet()){
                Map<String, Integer> menu = rst.getValue().getMenu();
                if(menu.containsKey(item.getKey()) && rst.getValue().getMaxOrders()>0){
                    hasItems = true;
                    rest = rst.getValue();
                }
                else {
                    hasItems = false;
                }
            }
            if(hasItems)
                restaurantList.add(rest);
        }
        return restaurantList.get(0);
    }
}
