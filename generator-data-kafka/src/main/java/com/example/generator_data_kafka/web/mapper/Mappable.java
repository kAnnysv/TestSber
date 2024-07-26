package com.example.generator_data_kafka.web.mapper;

public interface Mappable<E, D> {

    E toEntity(D dto);
    D toDto(E entity);
}
