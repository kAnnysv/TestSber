package org.example.repositories;

import org.example.entities.FruitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepository extends JpaRepository<FruitEntity, Integer> {
}
