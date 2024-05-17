package com.example.buyPhone.service;

import com.example.buyPhone.models.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ProductServiceTest {
    private ProductService productService;

    @BeforeEach
    public void setUp() {
        productService = new ProductService();
    }

    @Test
    public void testAddProduct() {
        Product product = new Product(9L, "test", "test", 100);
        productService.saveProduct(product);

        Assertions.assertFalse(productService.findByAll().isEmpty());
        Assertions.assertEquals(9, productService.findByAll().size());
        Assertions.assertNotNull(productService.getById(9L));

    }

    @Test
    public void testDeleteProduct() {
        productService.deleteProduct(1L);

        Assertions.assertFalse(productService.findByAll().isEmpty());
        Assertions.assertEquals(7, productService.findByAll().size());
        Assertions.assertNull(productService.getById(1L));

    }

    @Test
    public void testUpdateProduct() {
        Product product = new Product(1L, "test", "test", 100);
        productService.updateProduct(1L,product);

        Assertions.assertFalse(productService.findByAll().isEmpty());
        Assertions.assertEquals(8, productService.findByAll().size());
        Assertions.assertNotNull(productService.getById(1L));
        Assertions.assertEquals(product, productService.getById(1L));
    }

    @Test
    public void testGetProducts() {
        Product product = new Product(8L,"Apple", "Iphone 15",900);
        Product result = productService.getById(8L);

        Assertions.assertEquals(result, product);
    }



}
