package com.example.buyPhone.service;

import com.example.buyPhone.models.Product;
import com.example.buyPhone.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;



    public List<Product> findByAll(){
        return productRepository.findAll();
    }


    public void saveProduct(Product product){
       log.info("Saving product", product);
        productRepository.save(product);
    }
    public  Product getById(long id){
       return productRepository.findById(id).orElse(null);
    }

    public void deleteProduct(Long id){

        productRepository.deleteById(id);
        log.info("Delete product ", id);

    }
}
