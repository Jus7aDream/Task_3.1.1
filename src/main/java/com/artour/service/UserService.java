package com.artour.service;

import com.artour.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    User getUser(long id);

    void updateUser(long id, User updatedUser);

    void deleteUser(long id);
}
