package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {


    //
    @GetMapping("/cars")
    public String showPageCars(@RequestParam(value = "count", required = false) String count
            , Model model) {
        CarServiceImpl carService = new CarServiceImpl();
        ArrayList<Car> cars = carService.getAllCars();
        if (count != null) {
            int countInt = Integer.parseInt(count);
            List<Car> limitCars = cars.subList(0, Math.min(countInt, cars.size()));
            model.addAttribute("cars", limitCars);
        } else {
            model.addAttribute("cars", cars);
        }
        return "cars";
    }
}

