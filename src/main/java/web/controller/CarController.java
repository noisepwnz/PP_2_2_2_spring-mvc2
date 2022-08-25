package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {
//    private final CarService carService;
//
//    public CarController(CarService carService) {
//        this.carService = carService;
//    }

    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String getCar(@RequestParam(value = "count", defaultValue = "0") int id, ModelMap model) {
        model.addAttribute("MyCars", carService.getCarList(id));

        return "cars";
    }


}

