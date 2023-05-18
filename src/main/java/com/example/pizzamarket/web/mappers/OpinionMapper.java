package com.example.pizzamarket.web.mappers;

import com.example.pizzamarket.data.entities.OpinionEntity;
import com.example.pizzamarket.web.models.OpinionDto;

public class OpinionMapper {
    public static OpinionEntity toEntity(OpinionDto model) {
        OpinionEntity entity = new OpinionEntity();
        entity.setName(model.getName());
        entity.setOpinion(model.getOpinion());
        return entity;
    }

    public static OpinionDto toModel(OpinionEntity entity) {
        OpinionDto model = new OpinionDto();
        model.setName(entity.getName());
        model.setOpinion(entity.getOpinion());
        return model;
    }
}
