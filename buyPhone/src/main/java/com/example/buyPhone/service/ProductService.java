package com.example.buyPhone.service;

import com.example.buyPhone.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID;

    {
        products.add(new Product(++ID,"Samsung", "s001", 500));
        products.add(new Product(++ID,"Apple", "Iphone12",1000));
    }
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
    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }
}
