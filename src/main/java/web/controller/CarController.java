package web.controller;

import com.artour.service.UserService;
import com.artour.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
    @GetMapping("/users")
    public String printCarsList(@RequestParam(defaultValue = "10")int count, Model model) {
        UserService users = new UserServiceImpl();
        model.addAttribute("users", users.getAllUsers(count));
        return "users";
    }
}
