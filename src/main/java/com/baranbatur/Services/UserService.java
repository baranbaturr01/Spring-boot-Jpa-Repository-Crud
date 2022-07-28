package com.baranbatur.Services;

import com.baranbatur.Model.UserModel;
import com.baranbatur.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<UserModel> getAll() {
        List<UserModel> userList = new ArrayList<>();
        userList.addAll(userRepository.findAll());
        return userList;
    }

    public void save(UserModel user) {
        userRepository.save(user);
    }

    public void deleteById(int userId) {
        userRepository.deleteById((long) userId);
    }

    public Optional<UserModel> getUserById(int id) {
        Optional<UserModel> user = userRepository.findById((long) id);
        return user;
    }
}
