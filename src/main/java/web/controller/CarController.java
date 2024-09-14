package web.controller;

import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarsService carsService;

    @GetMapping("/cars")
    public String showPageCars(@RequestParam(value = "count", required = false) String count
            , Model model) {
        List<Car> cars = carsService.getCarsWithLimit(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}

