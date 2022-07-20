package com.example.springhateoas.service;
import com.example.springhateoas.exception.*;
import com.example.springhateoas.model.User;
import com.example.springhateoas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        if (userRepository.getByFirstName(user.getFirstName()).isPresent()) {
            throw new FirstNameAlreadyExistsException();
        }
        if (userRepository.getByLastName(user.getLastName()).isPresent()) {
            throw new LastNameAlreadyExistsException();
        }
        if (userRepository.getByEmail(user.getEmail()).isPresent()) {
            throw new EmailAlreadyExistsException();
        }
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User newUser) {
        User user = userRepository.findById(id).orElseThrow(UserIdAlreadyExistsException::new);
        user.setFirstName(newUser.getFirstName());
        user.setLastName(newUser.getLastName());
        user.setEmail(newUser.getEmail());
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        User user = userRepository.findById(id).orElseThrow(UserNotNullException::new);
        userRepository.delete(user);
    }
}
