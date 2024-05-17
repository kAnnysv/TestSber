package org.example.service;

import lombok.Getter;
import org.example.models.Phone;
import org.example.repositories.PhoneRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("phoneService")
@Getter
public class PhoneServiceImpl implements PhoneService {
    private  PhoneRepositoryImpl phoneRepository;

    @Autowired
    public PhoneServiceImpl(@Qualifier("jdbcTemplateRepository") PhoneRepositoryImpl phoneRepository) {
        this.phoneRepository = phoneRepository;

    }


    @Override
    public void savePhone(Phone phone) {
        phoneRepository.save(phone);

    }

    @Override
    public Phone getPhoneById(Long id) {
        return phoneRepository.findById(id);
    }

    @Override
    public List<Phone> getAllPhones() {
        return phoneRepository.findAll();
    }

    @Override
    public void deletePhone(Long id) {
        phoneRepository.delete(id);

    }
}
