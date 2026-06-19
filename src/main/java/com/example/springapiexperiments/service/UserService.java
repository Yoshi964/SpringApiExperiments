package com.example.springapiexperiments.service;

import com.example.springapiexperiments.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    private final List<User> usersList= new ArrayList<>();

    public UserService() {
        User user1 = new User(1, "John Doe", 18, "johnDoe@propMail.com");
        User user2 = new User(2, "Mark Clark", 21, "marcClark@propMail.com");
        this.usersList.addAll(Arrays.asList(user1, user2));
    }

    public User getUser(Integer id) {
        return usersList.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }

}
