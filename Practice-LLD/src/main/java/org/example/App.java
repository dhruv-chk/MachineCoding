package org.example;

import org.example.controllers.RestaurantController;
import org.example.controllers.UserController;
import org.example.models.Restaurant;
import org.example.models.User;
import org.example.repository.UserRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserController userController = new UserController();
        RestaurantController restaurantController = new RestaurantController();

        // register user
        User user = userController.register_user("Parlov", "male", "1234567890", "123456");
        System.out.println(String.format("User with id %s has been registered", user.getId()));

        // Login as a user.
        user = userController.login(0);

        // register a restaurant.
        List<String> pincodes = new ArrayList<>();
        pincodes.add("123456");
        pincodes.add("123457");
        Restaurant restaurant = restaurantController.registerRestaurant("Food Court", pincodes, "Thali", 100.0d, 5, 0.0d);




    }
}
