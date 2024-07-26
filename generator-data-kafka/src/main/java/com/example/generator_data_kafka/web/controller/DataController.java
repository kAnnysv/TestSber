package com.example.generator_data_kafka.web.controller;

import com.example.generator_data_kafka.model.Data;
import com.example.generator_data_kafka.service.KafkaDataService;
import com.example.generator_data_kafka.web.dto.DataDto;
import com.example.generator_data_kafka.web.mapper.DataMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {
    private final KafkaDataService kafkaDataService;

    private final DataMapper dataMapper;
    @PostMapping("/send")
    public void send(@RequestBody DataDto dto){
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }

}
