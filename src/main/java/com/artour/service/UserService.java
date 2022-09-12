package com.artour.service;
import com.artour.model.User;

import java.util.List;

public interface UserService {
    List<User> addUsers();

    List<User> getAllUsers(int count);
}
