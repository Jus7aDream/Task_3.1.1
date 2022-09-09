package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String printCarsList(Model model) {
        CarService cars = new CarServiceImpl();
        model.addAttribute("cars", cars.getAllCars());

        return "cars";
    }

}
