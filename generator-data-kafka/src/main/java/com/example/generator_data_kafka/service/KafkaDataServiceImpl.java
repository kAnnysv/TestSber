package com.example.generator_data_kafka.service;

import com.example.generator_data_kafka.model.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.kafka.sender.KafkaSender;
@Service
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService{
    private final KafkaSender<String, Object> sender;
    @Override
    public void send(Data data) {

    }
}
