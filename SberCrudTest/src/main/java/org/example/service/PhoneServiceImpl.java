package org.example.service;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.example.models.Phone;
import org.example.repositories.PhoneCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("phoneService")
@Getter
@Slf4j
public class PhoneServiceImpl implements PhoneService {
    private PhoneCrudRepository phoneRepository;

    @Autowired
    public PhoneServiceImpl(@Qualifier("jdbcTemplateRepository") PhoneCrudRepository phoneRepository) {
        this.phoneRepository = phoneRepository;

    }


    @Override
    public void savePhone(Phone phone) {
        phoneRepository.save(phone);
        log.info("Saving product", phone);

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
        log.info("Delete product ", id);

    }

    @Override
    public void updatePhone(Phone phone) {
        phoneRepository.update(phone);
        log.info("Update product ", phone.getId());
    }
}
