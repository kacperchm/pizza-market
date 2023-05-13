package com.example.pizzamarket.web.controller;

import com.example.pizzamarket.services.OrderService;
import com.example.pizzamarket.services.PizzaService;
import com.example.pizzamarket.web.models.OrderAddressModel;
import com.example.pizzamarket.web.models.PizzaDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    private PizzaService pizzaService;
    private OrderService orderService;

    public OrderController(PizzaService pizzaService, OrderService orderService) {
        this.pizzaService = pizzaService;
        this.orderService = orderService;
    }

    @GetMapping("/order/{pizza-id}")
    public String orderForm(Model model, @PathVariable("pizza-id") Long pizzaId) {
        PizzaDto pizza = pizzaService.getById(pizzaId);
        model.addAttribute("orderAddress", new OrderAddressModel());
        model.addAttribute("pizza", pizza);
        return "orderPage";
    }

    @PostMapping("/order/{pizza-id}")
    public String order(@PathVariable("pizza-id") Long pizzaId,
                        @ModelAttribute("orderAddress") OrderAddressModel orderAddressModel) {
        orderService.saveOrder(pizzaId, orderAddressModel);
        return "orderConfirmationPage";
    }
}
