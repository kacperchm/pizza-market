package com.example.pizzamarket.web.controller;

import com.example.pizzamarket.services.PizzaService;
import com.example.pizzamarket.web.models.PizzaDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class OrderController {

    private PizzaService pizzaService;

    public OrderController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("/order/{pizza-id}")
    public String orderForm(Model model, @PathVariable("pizza-id") Long pizzaId) {
        PizzaDto pizza = pizzaService.getById(pizzaId);
        model.addAttribute("pizza", pizza);
        return "orderPage";
    }
}
