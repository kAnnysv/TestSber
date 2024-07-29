package com.example.generator_data_kafka.web.dto;

import com.example.generator_data_kafka.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptionsDto {
    private int delayInSeconds;
    private Data.MeasurementType[] measurementTypes;

}
