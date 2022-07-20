package com.example.springhateoas.controller;
import com.example.springhateoas.model.User;
import com.example.springhateoas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/list")
    @Cacheable("cacheUsers")
    public List<User> getAllUsers() {
        System.out.println("Veri tabanından çekildi");
        List<User> userList = userService.getAllUsers();
        for (User user : userList) {
            user = addLinks(user);
        }
        return userList;

    }

    public User addLinks(User user) {
        user.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(UserController.class)
                .getByUserId(user.getId())).withSelfRel().withType("GET"));
        user.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(UserController.class)
                .createUser(user)).withSelfRel().withType("POST"));
        user.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(UserController.class)
                .updateUser(user.getId(), user)).withSelfRel().withType("PUT"));
        return user;

    }

    @GetMapping("/list/{id}")
    @Cacheable(value = "cacheUsers", key = "#id")
    public ResponseEntity<User> getByUserId(@PathVariable Long id) {
        User userById = userService.getUserById(id);
        return new ResponseEntity<>(userById, HttpStatus.CREATED);
    }

    @PostMapping("/save")
    @Caching(put = @CachePut(value = "cacheUsers", key = "#result.id"), evict = @CacheEvict(value = "cacheUsers", allEntries = true))
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/{id}")
    @CacheEvict(value = "cacheUsers", key = "#id")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }

}
