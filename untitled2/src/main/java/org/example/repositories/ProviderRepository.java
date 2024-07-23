package org.example.repositories;

import org.example.entities.ProviderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<ProviderEntity, Integer> {
}
