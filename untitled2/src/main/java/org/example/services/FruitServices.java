package org.example.services;

import lombok.RequiredArgsConstructor;
import org.example.entities.FruitEntity;
import org.example.repositories.FruitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FruitServices {
    private final FruitRepository fruitRepository;



    public void save(FruitEntity fruitEntity){
        fruitRepository.save(fruitEntity);
    }
    public List<FruitEntity> getAll(){
        return fruitRepository.findAll();
    }
    public void saveAll(List<FruitEntity> fruitEntities){
        fruitRepository.saveAll(fruitEntities);
    }
}
