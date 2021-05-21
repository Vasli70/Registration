package com.srini.registration.service;

import com.srini.registration.entity.User;
import com.srini.registration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(int id){
        return userRepository.findById(id).orElse(null);
    }

    public User getUserByEmail(String email){
        return userRepository.findUserByEmail(email);
    }


    public String deleteUser(int id){
        userRepository.deleteById(id);
        return ("User Deleted with ID " + id);
    }

    public User addUser(User user){
        return userRepository.save(user);
    }


}
