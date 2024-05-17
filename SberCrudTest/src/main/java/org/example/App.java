package org.example;

import org.example.models.Phone;
import org.example.repositories.PhoneCrudRepository;
import org.example.repositories.PhoneRepositoryImpl;

import org.example.service.PhoneServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org/example");
        PhoneServiceImpl phoneService = context.getBean("phoneService", PhoneServiceImpl.class);
        PhoneCrudRepository phoneRepository =  context.getBean("jdbcTemplateRepository", PhoneCrudRepository.class);
        Phone phone = new Phone(1L,"OPPO", "S-234", 500);
        phoneRepository.save(phone);








    }
}
