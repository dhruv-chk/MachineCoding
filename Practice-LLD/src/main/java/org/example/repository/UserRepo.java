package org.example.repository;

import org.example.models.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepo {
    int id;
    public Map<Integer, User> userMap;

    public UserRepo() {
        this.id = 0;
        this.userMap = new HashMap<>();
    }

    public void registerUser(User user){
        user.setId(id);
        userMap.put(id,user);
        id++;
    }

    public User login(int id){
        User user = userMap.get(id);

        for (Map.Entry<Integer, User> userEntry : userMap.entrySet()) {
            userEntry.setValue(userEntry.getValue().setLoggedin(false));
        }
        user.setLoggedin(true);
        
        return  user;
    }
}
