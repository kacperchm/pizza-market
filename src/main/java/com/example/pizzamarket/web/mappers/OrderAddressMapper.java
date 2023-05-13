package com.example.pizzamarket.web.mappers;

import com.example.pizzamarket.data.entities.OrderAddressEntity;
import com.example.pizzamarket.web.models.OrderAddressModel;

public class OrderAddressMapper {
    public static OrderAddressEntity toEntity(OrderAddressModel model) {
        OrderAddressEntity entity = new OrderAddressEntity();
                entity.setFirstName(model.getFirstName());
                entity.setLastName(model.getLastName());
                entity.setStreet(model.getStreet());
                entity.setPostalCode(model.getPostalCode());
                entity.setCity(model.getCity());
        return entity;
    }
}
