package com.srini.registration.controller;


import com.srini.registration.entity.User;
import com.srini.registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getallusers")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/getuser/{id}")
    public User getUser(@PathVariable int id) {
        System.out.println(id);
        return userService.getUser(id);
    }

    @GetMapping("/getuserbyemail/{mail}")
    public User getEmail(@PathVariable String mail) {
             return userService.getUserByEmail(mail);
    }



    @PostMapping("/Register")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return (user.getName() + " added Successfully ");
    }

    @DeleteMapping("/deleteuser/{id}")
    public List<User> deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        // return (" user with ID " + id + " Deleted" );
        return userService.getUsers();
    }
}


