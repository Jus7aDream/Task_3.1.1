package com.artour.dao;

import com.artour.model.User;

import java.util.List;

/**
 * @ In the name of Allah, most gracious and most merciful 12.09.2022
 */
public interface UserDao {
    List<User> allUsers(int page);

    int usersCount();

    void add(User user);

    void delete(User user);

    void edit(User user);

    User getById(int id);
}
