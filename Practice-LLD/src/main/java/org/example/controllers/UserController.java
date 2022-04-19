package org.example.controllers;

import org.example.models.Order;
import org.example.models.Restaurant;
import org.example.models.User;
import org.example.repository.OrderRepo;
import org.example.repository.UserRepo;

public class UserController {

    UserRepo userRepo;
    OrderRepo orderRepo;

    public UserController() {
        this.userRepo = new UserRepo();
        this.orderRepo = new OrderRepo();
    }

    public User register_user(String name, String gender, String phoneNumber, String pincode){

        User user = new User(name, gender, phoneNumber, pincode);
        userRepo.registerUser(user);

        return user;
    }

    public User login(int id){
       return userRepo.login(id);
    }

    public Order placeOrder(User user, Restaurant restaurant, int quantity){
        orderRepo.placeOrder(user, )
    }
}
