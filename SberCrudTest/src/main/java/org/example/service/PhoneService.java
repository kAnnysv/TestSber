package org.example.service;

import org.example.models.Phone;

import java.util.List;

public interface PhoneService {
    public void savePhone(Phone phone);
    public Phone getPhoneById(Long id);
    public List<Phone> getAllPhones();
    public void deletePhone(Long id);
    public void updatePhone(Phone phone);
}
