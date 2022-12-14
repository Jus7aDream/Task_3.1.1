package com.artour.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ In the name of Allah, most gracious and most merciful! 19.09.2022
 */
@Controller
@RequiredArgsConstructor
public class HomeController {

    @GetMapping()
    public String start() {
        return "index";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin/admin";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }
}