package com.example.springhateoas.service;

import com.example.springhateoas.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User getUserById(Long id);

    List<User> getAllUsers();

    User createUser(User user);

    User updateUser(Long id ,User user);

    void deleteUser(Long id);


}
