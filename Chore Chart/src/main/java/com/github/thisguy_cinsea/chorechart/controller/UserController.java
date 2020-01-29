package com.github.thisguy_cinsea.chorechart.controller;

import com.github.thisguy_cinsea.chorechart.exception.ResourceNotFoundException;
import com.github.thisguy_cinsea.chorechart.model.User;
import com.github.thisguy_cinsea.chorechart.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserServices userServices;

    @GetMapping("/users")
    public User[] getAllUsers(){
        System.out.println("getAllUSers called");
        return userServices.getAllUsers().toArray(new User[0]);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id")UUID userId)
        throws ResourceNotFoundException{
        return userServices.getUserById(userId);
    }

    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user){
        return userServices.createUser(user);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value = "id") UUID userId,
                                           @Valid @RequestBody User userDetails)
        throws ResourceNotFoundException {
        return userServices.updateUser(userId, userDetails);
    }

    @DeleteMapping("/user/{id}")
    public Map<String, Boolean> deleteUser(@PathVariable(value = "id") UUID userId)
        throws ResourceNotFoundException {
        return userServices.deleteUser(userId);
    }
}
