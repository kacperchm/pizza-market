package com.example.pizzamarket.web.controller;

import com.example.pizzamarket.services.OpinionService;
import com.example.pizzamarket.web.models.OpinionDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class OpinionController {

    private OpinionService service;

    public OpinionController(OpinionService service) {
        this.service = service;
    }

    @GetMapping("/opinion")
    public String opinionPage(Model model) {
        List<OpinionDto> opinions = service.findAll();
        model.addAttribute("opinions", opinions);
        model.addAttribute("opinion", new OpinionDto());
        return "opinionPage";
    }

    @PostMapping("/opinion")
    public String order(@ModelAttribute("opinion") OpinionDto opinion) {
        service.save(opinion);
        return "redirect:/opinion";
    }
}
