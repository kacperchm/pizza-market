package com.example.pizzamarket.web.mappers;

import com.example.pizzamarket.data.entities.PizzaEntity;
import com.example.pizzamarket.web.models.PizzaDto;

public class PizzaMapper {

    public static PizzaDto toModel(PizzaEntity entity) {
        return new PizzaDto(entity.getId(), entity.getName(), entity.getPrice(), entity.getIngredients());
    }
}
