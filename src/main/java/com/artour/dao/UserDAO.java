package com.artour.dao;

import com.artour.model.User;

import java.util.List;

/**
 * @ In the name of Allah, most gracious and most merciful 12.09.2022
 */
public interface UserDAO {

    List<User> getAllUsers();

    void addUser(User user);

    User getUserById(Long id);

    void updateUser(Long id, User updatedUser);

    void deleteUser(Long id);
}
