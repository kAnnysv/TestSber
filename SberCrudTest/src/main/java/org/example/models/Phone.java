package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;
/**
 * */

@Data
@AllArgsConstructor
public class Phone {
    private Long id;
    private String company;
    private String model;
    private Integer price;
    public Phone() {

    }
}
