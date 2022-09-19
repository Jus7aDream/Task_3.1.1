package com.artour.service;

import com.artour.dao.UserDAO;
import com.artour.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override

    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override

    public User getUser(long id) {
        return userDAO.getUserById(id);
    }

    @Override
    public void updateUser(long id, User updatedUser) {
        userDAO.updateUser(id, updatedUser);
    }

    @Override
    public void deleteUser(long id) {
        userDAO.deleteUser(id);
    }

}
