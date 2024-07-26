package com.example.generator_data_kafka.service;

import com.example.generator_data_kafka.model.Data;
import com.example.generator_data_kafka.web.dto.DataDto;

public interface KafkaDataService {
    void send(Data data);
}
