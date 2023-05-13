package com.example.pizzamarket.web.models;

import jakarta.persistence.Column;

import java.math.BigDecimal;

public class PizzaDto {
    private Long id;
    private String name;
    private BigDecimal price;
    private String ingredients;

    public PizzaDto(Long id, String name, BigDecimal price, String ingredients) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}


