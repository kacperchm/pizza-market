package com.example.pizzamarket.services;

import com.example.pizzamarket.data.entities.PizzaEntity;
import com.example.pizzamarket.data.repositories.PizzaRepository;
import com.example.pizzamarket.web.mappers.PizzaMapper;
import com.example.pizzamarket.web.models.PizzaDto;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PizzaService {

    private PizzaRepository repository;

    public PizzaService(PizzaRepository repository) {
        this.repository = repository;
    }

    public List<PizzaDto> findAll() {
        List<PizzaEntity> pizzas = repository.findAll();
        return pizzas.stream()
                .map(PizzaMapper::toModel)
                .toList();
    }

    public PizzaDto getById(Long pizzaId) {
       PizzaEntity pizza = repository.findById(pizzaId).orElseThrow(EntityNotFoundException::new);
        return PizzaMapper.toModel(pizza);
    }
}
