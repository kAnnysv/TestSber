package org.example.services;

import lombok.RequiredArgsConstructor;
import org.example.entities.ProviderEntity;
import org.example.repositories.ProviderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProviderService {
    private final ProviderRepository providerRepository;

    public void saveAll(List<ProviderEntity> providerEntities){
        providerRepository.saveAll(providerEntities);
    }
    public void save(ProviderEntity providerEntity){
        providerRepository.save(providerEntity);
    }

    public List<ProviderEntity>getAll(){
        return providerRepository.findAll();
    }





}
