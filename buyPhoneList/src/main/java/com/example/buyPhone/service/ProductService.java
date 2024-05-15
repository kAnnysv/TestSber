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
        products.add(new Product(++ID,"Samsung", "S-001", 500));
        products.add(new Product(++ID,"Apple", "Iphone 12",1000));
        products.add(new Product(++ID,"Samsung", "Q-001", 400));
        products.add(new Product(++ID,"Apple", "Iphone 13",900));
        products.add(new Product(++ID,"Samsung", "M-956", 600));
        products.add(new Product(++ID,"Apple", "Iphone 14",1000));
        products.add(new Product(++ID,"Samsung", "Q-001", 400));
        products.add(new Product(++ID,"Apple", "Iphone 15",900));
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
