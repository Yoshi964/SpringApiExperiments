package com.example.springapiexperiments.service;

import com.example.springapiexperiments.UserRepository.UserRepository;
import com.example.springapiexperiments.api.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public User getUser(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(Integer id, User user) {
       userRepository.findById(id).ifPresent(user1 -> {
           if(user.getAge()!=null){
               user1.setAge(user.getAge());
           }
           if(user.getName()!=null){
               user1.setName(user.getName());
           }
           if(user.getEmail()!=null){
               user1.setEmail(user.getEmail());
           }
           userRepository.save(user1);
       });
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
