package com.example.buyPhone.service;

import com.example.buyPhone.models.Product;
import com.example.buyPhone.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    private List<Product> products = new ArrayList<>();

    public List<Product> findByAll(){
        return products;
    }
    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }
    public Product getById(long id){
        for(Product product : products){
            if(product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }
    public void updateProduct(Long id, Product product){
        for(Product pr : products){
            if(pr.getId().equals(id)){
                pr.setCompany(product.getCompany());
                pr.setModel(product.getModel());
                pr.setPrice(product.getPrice());
                return;

            }
        }

    }
    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }
}
