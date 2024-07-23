package org.example.entities;

import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)

@Table(name = "fruit_table")
public class FruitEntity {
    @Id
    @Column(name = "id_fruit")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer id;



    @Column(name = "fruit_nane")
    private String fruitName;
    @Column(name = "provider_code")
    private Integer providerCode;

}
