package com.example.pizzamarket.web.controller;

import com.example.pizzamarket.services.PizzaService;
import com.example.pizzamarket.web.models.PizzaDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MenuController {

    private PizzaService service;

    public MenuController(PizzaService service) {
        this.service = service;
    }

    @GetMapping("/menu")
    public String menuPage(Model model) {
        List<PizzaDto> pizzas = service.findAll();
        model.addAttribute("pizzas", pizzas);
        return "menuPage";
    }
}
