package com.example.buyPhone.models;

import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class Product {
    private Long id;
    private String company;
    private String model;
    private Integer price;



}
