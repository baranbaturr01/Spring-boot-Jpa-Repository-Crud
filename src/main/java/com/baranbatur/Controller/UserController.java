package com.baranbatur.Controller;

import com.baranbatur.Model.UserModel;
import com.baranbatur.Repository.UserRepository;
import com.baranbatur.Services.UserService;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/all", produces = "application/json")
    public HashMap<String, Object> getAllUsers() {
        try {
            List<UserModel> users = userService.getAll();

            HashMap<String, Object> response = new HashMap<>();
            response.put("status", "success");
            response.put("users", users.stream().peek(user -> user.setPassword("")));
            return response;
        } catch (Exception e) {
            return null;
        }
    }


    //charset=UTF-8

    @PostMapping(value = "/add", produces = "application/json")
    public boolean addUser(@RequestBody ObjectNode user) {
        try {
            UserModel userModel = new UserModel();
            userModel.setName(user.get("name").asText());
            userModel.setSurname(user.get("surname").asText());
            userModel.setEmail(user.get("email").asText());
            userModel.setPassword(user.get("password").asText());
            userService.save(userModel);

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
