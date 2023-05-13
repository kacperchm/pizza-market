package com.example.pizzamarket.services;

import com.example.pizzamarket.data.entities.OrderAddressEntity;
import com.example.pizzamarket.data.entities.OrderEntity;
import com.example.pizzamarket.data.entities.PizzaEntity;
import com.example.pizzamarket.data.repositories.OrderRepository;
import com.example.pizzamarket.data.repositories.PizzaRepository;
import com.example.pizzamarket.web.mappers.OrderAddressMapper;
import com.example.pizzamarket.web.models.OrderAddressModel;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    private OrderRepository orderRepository;
    private PizzaRepository pizzaRepository;

    public OrderService(OrderRepository orderRepository, PizzaRepository pizzaRepository) {
        this.orderRepository = orderRepository;
        this.pizzaRepository = pizzaRepository;
    }

    @Transactional
    public void saveOrder(Long pizzaId, OrderAddressModel orderAddressModel) {
        PizzaEntity pizzaEntity = pizzaRepository.findById(pizzaId)
                .orElseThrow(EntityNotFoundException::new );
        OrderAddressEntity orderAddressEntity = OrderAddressMapper.toEntity(orderAddressModel);
        OrderEntity order = new OrderEntity();
        order.setPizzaName(pizzaEntity.getName());
        order.setPrice(pizzaEntity.getPrice());
        order.setOrderAddress(orderAddressEntity);
        orderRepository.save(order);
    }
}
