package com.artour.service;

import com.artour.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    void addUser(User user);

    void updateUser(Long id, User updatedUser);

    void deleteUser(Long id);
}