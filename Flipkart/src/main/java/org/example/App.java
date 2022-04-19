package org.example;

import org.example.controller.RestaurantController;
import org.example.models.Status;
import org.example.models.Strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        RestaurantController restaurantController = new RestaurantController();

        // Restaurant 1.
        Map<String, Integer> menu = new HashMap<>();
        menu.put("Veg Biryani", 100);
        menu.put("Chicken Biryani", 150);

        restaurantController.onboardRestaurant("R1", 1, menu, 4.5d);

        // Restaurant 2.
        Map<String, Integer> menu2 = new HashMap<>();
        menu2.put("Veg Biryani", 80);
        menu2.put("Chicken Biryani", 175);
        menu2.put("Idli", 10);
        menu2.put("Dosa", 50);

        restaurantController.onboardRestaurant("R2", 1, menu, 4.5d);

        // Restaurant 3.
        Map<String, Integer> menu3 = new HashMap<>();
        menu3.put("Gobi Manchurian", 150);
        menu3.put("Chicken Biryani", 150);
        menu3.put("Idli", 15);
        menu3.put("Dosa", 30);

        restaurantController.onboardRestaurant("R3", 1, menu3, 4.5d);

        restaurantController.updateMenu("R2", "Chicken Biryani", 150);

        Map<String, Integer> items = new HashMap<>();
        items.put("Idli", 3);
        items.put("Dosa", 1);
        restaurantController.order("Ashwin", items, Strategy.LOWEST_COST);
        restaurantController.updateOrder("R3", 0, Status.COMPLETED);
        restaurantController.order("Ashwin", items, Strategy.LOWEST_COST);
//        restaurantController.updateOrder("R1", 2, Status.COMPLETED);

    }

}
