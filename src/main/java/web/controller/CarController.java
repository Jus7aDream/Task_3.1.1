package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String printCarsList(@RequestParam(defaultValue = "7") Integer count, Model model) {
        CarService cars = new CarServiceImpl();
        model.addAttribute("cars", cars.getAllCars(count));
        return "cars";
    }
}
