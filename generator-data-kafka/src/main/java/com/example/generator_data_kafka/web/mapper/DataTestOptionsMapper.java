package com.example.generator_data_kafka.web.mapper;

import com.example.generator_data_kafka.model.Data;
import com.example.generator_data_kafka.model.test.DataTestOptions;
import com.example.generator_data_kafka.web.dto.DataDto;
import com.example.generator_data_kafka.web.dto.DataTestOptionsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
