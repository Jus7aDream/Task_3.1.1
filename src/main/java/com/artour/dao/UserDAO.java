package com.artour.dao;

import com.artour.model.User;

import java.util.List;

/**
 * @ In the name of Allah, most gracious and most merciful 12.09.2022
 */
public interface UserDAO {

    List<User> getAllUsers();

    void addUser(User user);

    User getUserById(long id);

    void updateUser(long id, User updatedUser);

    void deleteUser(long id);
}
