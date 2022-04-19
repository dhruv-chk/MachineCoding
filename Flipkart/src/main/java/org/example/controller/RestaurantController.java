package org.example.controller;

import org.example.models.*;
import org.example.repositories.OrderRepo;
import org.example.repositories.RestaurantRepo;
import org.example.service.SelectLowestCostRestaurant;
import org.example.service.SelectRestaurant;

import java.util.Map;


public class RestaurantController {

    OrderRepo orderRepo;
    RestaurantRepo restaurantRepo;

    public RestaurantController() {
        this.orderRepo = new OrderRepo();
        this.restaurantRepo = new RestaurantRepo();
    }

    public void onboardRestaurant(String name, int maxOrders, Map<String, Integer> menu, double rating){
        Restaurant restaurant = new Restaurant(name, maxOrders, menu, rating);
        restaurantRepo.onboardRestaurant(restaurant);
    }

    public void updateMenu(String name, String item, int price){
                Restaurant restaurant = restaurantRepo.getRestaurant(name);
                Map<String, Integer> menu = restaurant.getMenu();
                menu.put(item, price);
                restaurant.setMenu(menu);
                restaurantRepo.updateRestaurant(restaurant);
    }

    public void order(String username, Map<String, Integer> items, Strategy strategy){
        try{
            Order order = new Order(username,items, strategy);
            Restaurant restaurant = null;
            SelectRestaurant selectRestaurant = null;
            switch (strategy){
                case RATING: break;
                case LOWEST_COST:
                    selectRestaurant = new SelectLowestCostRestaurant();
                    break;
            }
            restaurant = selectRestaurant.select(restaurantRepo, orderRepo, order);
            if(restaurant !=null){
                restaurant.setMaxOrders(restaurant.getMaxOrders()-1);
                restaurantRepo.updateRestaurant(restaurant);
                OrderStatus orderStatus = new OrderStatus(restaurant, Status.ACCEPTED);
                order.setOrderStatus(orderStatus);
                orderRepo.placeOrder(order);
            }
            else
                throw new RuntimeException("Restaurant not found");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateOrder(String restaurantName, Integer id, Status status){
        Order order = orderRepo.getOrder(id);
        orderRepo.updateOrder(order, status);
        Restaurant restaurant = restaurantRepo.getRestaurant(restaurantName);
        restaurant.setMaxOrders(restaurant.getMaxOrders() + 1);
    }
}
