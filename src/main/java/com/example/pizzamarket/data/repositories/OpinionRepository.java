package com.example.pizzamarket.data.repositories;

import com.example.pizzamarket.data.entities.OpinionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpinionRepository extends JpaRepository<OpinionEntity, Long> {
}
