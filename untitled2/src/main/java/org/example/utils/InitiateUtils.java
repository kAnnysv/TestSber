package org.example.utils;

import lombok.RequiredArgsConstructor;
import org.example.entities.FruitEntity;
import org.example.entities.ProviderEntity;
import org.example.repositories.FruitRepository;
import org.example.services.FruitServices;
import org.example.services.ProviderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class InitiateUtils implements CommandLineRunner {
    private final FruitServices fruitServices;
    private  final ProviderService providerService;



    @Override
    public void run(String... args) throws Exception {
        List<FruitEntity> fruits = new ArrayList<>(
                Arrays.asList(new FruitEntity()
                                .setFruitName("Fruit1")
                                .setProviderCode(Math.abs(new Random().nextInt() % 10)),//сюда добавлен метод рандомного числа от 0 до 10
                        new FruitEntity()
                                .setFruitName("Fruit2")
                                .setProviderCode(Math.abs(new Random().nextInt() % 10)),
                        new FruitEntity()
                                .setFruitName("Fruit3")
                                .setProviderCode(Math.abs(new Random().nextInt() % 10)),
                        new FruitEntity()
                                .setFruitName("Fruit4")
                                .setProviderCode(Math.abs(new Random().nextInt() % 10)),
                        new FruitEntity()
                                .setFruitName("Fruit5")
                                .setProviderCode(Math.abs(new Random().nextInt() % 10)),
                        new FruitEntity()
                                .setFruitName("Fruit6")
                                .setProviderCode(Math.abs(new Random().nextInt() % 10)),
                        new FruitEntity()
                                .setFruitName("Fruit7")
                                .setProviderCode(Math.abs(new Random().nextInt() % 10)),
                        new FruitEntity()
                                .setFruitName("Fruit8")
                                .setProviderCode(Math.abs(new Random().nextInt() % 10)),
                        new FruitEntity()
                                .setFruitName("Fruit9")
                                .setProviderCode(Math.abs(new Random().nextInt() % 10)))
        );
        List<ProviderEntity> providers = new ArrayList<>(
                Arrays.asList( new ProviderEntity()
                                .setProviderName("Provider1"),
                        new ProviderEntity()
                                .setProviderName("Provider2"),
                        new ProviderEntity()
                                .setProviderName("Provider3"),
                        new ProviderEntity()
                                .setProviderName("Provider4"),
                        new ProviderEntity()
                                .setProviderName("Provider5"))
        );

        fruitServices.saveAll(fruits);
        providerService.saveAll(providers);
        System.out.println("\nТаблица поставщиков");
        for (ProviderEntity providerEntity : providerService.getAll()) {
            System.out.println(providerEntity);
        }



    }
}
