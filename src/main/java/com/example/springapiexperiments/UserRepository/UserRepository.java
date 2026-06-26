package com.example.springapiexperiments.UserRepository;

import com.example.springapiexperiments.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
