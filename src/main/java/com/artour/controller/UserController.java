package com.artour.controller;

import com.artour.model.User;
import com.artour.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @ In the name of Allah, most gracious and most merciful! 19.09.2022
 */
@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String start() {
        return "index";
    }

    @GetMapping("/users")
    public String showAllUsers(Model model) {
        model.addAttribute("allUsers", userService.getAllUsers());
        return "users";
    }

    @GetMapping("/userCard")
    public String userCard(Model model) {
        model.addAttribute("user", new User());
        return "userCard";
    }

    @PostMapping("/users")
    public String createUser(@ModelAttribute("user")
                             @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "/userCard";
        userService.addUser(user);
        return "redirect:/users";
    }

    @GetMapping("/users/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "show";
    }

    @GetMapping("/users/{id}/edit")
    public String edit(Model model, @PathVariable("id") Long idNew) {
        model.addAttribute("user", userService.getUserById(idNew));
        return "edit";
    }

    @PatchMapping("/users/{id}")
    public String update(@ModelAttribute("user")
                         @Valid User user, BindingResult bindingResult,
                         @PathVariable("id") Long id) {
        if (bindingResult.hasErrors())
            return "/edit";
        userService.updateUser(id, user);
        return "redirect:/users";
    }

    @DeleteMapping("/users/{id}")
    public String delete(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }
}