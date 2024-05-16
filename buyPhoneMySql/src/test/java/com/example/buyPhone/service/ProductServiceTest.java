package com.example.buyPhone.service;

import com.example.buyPhone.models.Product;
import com.example.buyPhone.repositories.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

@Mock
private ProductRepository productRepository;

@InjectMocks
private ProductService productService;

@Test
    public void testFindByAll() {}

    @Test
    public void testFindById() {}

    @Test
    public void testSave() {
        List<Product> products = getProducts();
        Product product = new Product(9L, "test", "test", 100);


        Mockito.when(productRepository.findAll()).thenReturn(products);
        System.out.println(productService.findByAll().size());
        productService.saveProduct(product);
        System.out.println(productService.findByAll().size());

        Assertions.assertFalse(productService.findByAll().isEmpty());
        Assertions.assertEquals(9, productService.findByAll().size());
        Assertions.assertNotNull(productService.getById(9L));
    }

    @Test
    public void testDelete() {
        List<Product> products = getProducts();
        Mockito.when(productRepository.findAll()).thenReturn(products);
        System.out.println(productService.findByAll().size());
        productService.deleteProduct(1L);
        System.out.println(productService.findByAll().size());




    }


    private List<Product> getProducts(){
    List<Product> products = new ArrayList<>();


        products.add(new Product(1L,"Samsung", "S-001", 500));
        products.add(new Product(2L,"Apple", "Iphone 12",1000));
        products.add(new Product(3L,"Samsung", "Q-001", 400));
        products.add(new Product(4L,"Apple", "Iphone 13",900));
        products.add(new Product(5L,"Samsung", "M-956", 600));
        products.add(new Product(6L,"Apple", "Iphone 14",1000));
        products.add(new Product(7L,"Samsung", "Q-001", 400));
        products.add(new Product(8L,"Apple", "Iphone 15",900));
        return products;


    }



}
