package com.example.pizzamarket.web.models;

import jakarta.persistence.Column;

public class OpinionDto {
    private String name;
    private String opinion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}
