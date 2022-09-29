package com.artour.service;

import com.artour.model.User;
import com.artour.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public void addUser(User user) {
        userRepo.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public void updateUser(Long id, User updatedUser) {
        User user = userRepo.findById(id).orElse(null);
        if(user.getId()==null){
            userRepo.save(updatedUser);
        }else {
            userRepo.save(updatedUser);
        }

    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}