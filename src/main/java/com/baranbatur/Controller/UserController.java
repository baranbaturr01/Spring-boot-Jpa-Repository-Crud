package com.baranbatur.Controller;

import com.baranbatur.Model.UserModel;
import com.baranbatur.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    public List<UserModel> getAllUsers(@RequestParam(required = false) String name) {
        try {
            List<UserModel> users = userRepository.findAll();
            return userRepository.findAll();
        } catch (Exception e) {
            return null;
        }
    }

    @Autowired
    UserRepository userRepository;

    @GetMapping("/all")
    public List<UserModel> getAllUsers2(@RequestParam(required = false) String name) {
        try {
            List<UserModel> users = userRepository.findAll();
            return userRepository.findAll();
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping("/register")
    public String register(@RequestBody String name, @RequestBody String surname, @RequestBody String email, @RequestBody String password) {
        //encrypt password
        //save user

        try {
            UserModel user = new UserModel();
            user.setName(name);
            user.setSurname(surname);
            user.setEmail(email);
            user.setPassword(password);
            userRepository.save(user);
            //if user saved successfully, return success object
            return "success";
        } catch (Exception e) {
            return null;
        }
    }
}
