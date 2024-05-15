package com.example.buyPhone.repositories;

import com.example.buyPhone.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
