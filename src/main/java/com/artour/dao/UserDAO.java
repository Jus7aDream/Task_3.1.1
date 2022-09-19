package com.artour.dao;

import com.artour.model.User;

import java.util.List;

/**
 * @ In the name of Allah, most gracious and most merciful 12.09.2022
 */
public interface UserDAO {

    List<User> getAllUsers();

    void createUser(User user);

    User get(int id);

    void update(int id, User updatedUser);

    void delete(int id);
}
