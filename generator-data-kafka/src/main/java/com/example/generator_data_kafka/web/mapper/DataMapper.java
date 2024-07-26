package com.example.generator_data_kafka.web.mapper;

import com.example.generator_data_kafka.model.Data;
import com.example.generator_data_kafka.web.dto.DataDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
