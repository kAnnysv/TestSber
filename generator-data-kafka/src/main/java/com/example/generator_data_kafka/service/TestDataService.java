package com.example.generator_data_kafka.service;

import com.example.generator_data_kafka.model.test.DataTestOptions;

public interface TestDataService {
    void sendMessages(DataTestOptions testOptions);
}
