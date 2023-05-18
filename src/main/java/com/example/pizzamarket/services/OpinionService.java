package com.example.pizzamarket.services;

import com.example.pizzamarket.data.entities.OpinionEntity;
import com.example.pizzamarket.data.repositories.OpinionRepository;
import com.example.pizzamarket.web.mappers.OpinionMapper;
import com.example.pizzamarket.web.mappers.PizzaMapper;
import com.example.pizzamarket.web.models.OpinionDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OpinionService {

    private OpinionRepository repository;

    public OpinionService(OpinionRepository repository) {
        this.repository = repository;
    }

    public List<OpinionDto> findAll() {
        List<OpinionEntity> opinionEntities = repository.findAll();
        return opinionEntities.stream()
                .map(OpinionMapper::toModel)
                .toList();
    }

    public void save(OpinionDto opinionDto) {
        OpinionEntity opinion = OpinionMapper.toEntity(opinionDto);
        repository.save(opinion);
    }
}
