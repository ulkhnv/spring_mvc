package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class CarController {
    @Autowired
    CarService service;

    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String getCars(ModelMap model, @RequestParam(name = "locale", defaultValue = "") String locale) {

        switch (locale) {
            case "en":
                model.addAttribute("title", "CARS");
                break;
            case "ru":
                model.addAttribute("title", "МАШИНЫ");
                break;
            default:
                model.addAttribute("title", "TITLE");
        }
        model.addAttribute("cars", service.getCars());
        return "cars";
    }
}
