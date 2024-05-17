package org.example.service;

import org.example.models.Phone;
import org.example.repositories.CrudRepository;
import org.example.repositories.PhoneCrudRepository;
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
public class PhoneServiceTest {
    @Mock
    private PhoneServiceImpl repository;
    @InjectMocks
    private PhoneServiceImpl phoneService;



    @Test
    public void testFindAll() {}
    @Test
    public void testFindById() {}

    @Test
    public void testSave() {
        List<Phone> products = getProducts();
        Phone product = new Phone(9L, "test", "test", 100);


        Mockito.when(repository.getAllPhones()).thenReturn(products);


        System.out.println(phoneService.getAllPhones().size());
        phoneService.savePhone(product);
        System.out.println(phoneService.getAllPhones().size());

        Assertions.assertFalse(phoneService.getAllPhones().isEmpty());
        Assertions.assertEquals(9, phoneService.getAllPhones().size());
        Assertions.assertNotNull(phoneService.getPhoneById(9L));
    }
    @Test
    public void testDelete() {
//
    }





    private List<Phone> getProducts(){
        List<Phone> products = new ArrayList<>();


        products.add(new Phone(1L,"Samsung", "S-001", 500));
        products.add(new Phone(2L,"Apple", "Iphone 12",1000));
        products.add(new Phone(3L,"Samsung", "Q-001", 400));
        products.add(new Phone(4L,"Apple", "Iphone 13",900));
        products.add(new Phone(5L,"Samsung", "M-956", 600));
        products.add(new Phone(6L,"Apple", "Iphone 14",1000));
        products.add(new Phone(7L,"Samsung", "Q-001", 400));
        products.add(new Phone(8L,"Apple", "Iphone 15",900));
        return products;


    }




}
