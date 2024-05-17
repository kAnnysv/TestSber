package org.example;

import org.example.models.Phone;
import org.example.repositories.PhoneRepositoryImpl;

import org.example.service.PhoneServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org/example/service");
        PhoneServiceImpl phoneService = context.getBean("phoneService", PhoneServiceImpl.class);
        PhoneRepositoryImpl phoneRepository =  context.getBean("phoneRepository", PhoneRepositoryImpl.class);
        Phone phone = new Phone(1L,"OPPO", "S-234", 500);
        phoneRepository.save(phone);








    }
}
