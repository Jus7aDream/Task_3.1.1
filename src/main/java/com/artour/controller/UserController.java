package com.artour.controller;

import com.artour.dao.UserDAO;
import com.artour.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @ In the name of Allah, most gracious and most merciful! 19.09.2022
 */
@Controller
public class UserController {


    private final UserDAO userDAO;

    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @GetMapping()
    public String start() {
        return "index";
    }

    @GetMapping("/users")
    public String showAllUsers(Model model) {
        model.addAttribute("allUsers", userDAO.getAllUsers());
        return "users";
    }

    @GetMapping("/userCard")
    public String userCard(Model model) {
        model.addAttribute("user", new User());
        return "userCard";
    }

    @PostMapping("/users")
    public String createUser(@ModelAttribute("user") User user) {
        userDAO.addUser(user);
        return "redirect:/users";
    }

    @GetMapping("/users/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userDAO.getUserById(id));
        return "show";
    }

    @GetMapping("/users/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("user", userDAO.getUserById(id));
        return "edit";
    }

    @PatchMapping("/users/{id}")
    public String update(@ModelAttribute("user") User user, @PathVariable("id") int id) {
        userDAO.updateUser(id, user);
        return "redirect:/users";
    }

    @DeleteMapping("/users/{id}")
    public String delete(@PathVariable("id") int id) {
        userDAO.deleteUser(id);
        return "redirect:/users";
    }
}
